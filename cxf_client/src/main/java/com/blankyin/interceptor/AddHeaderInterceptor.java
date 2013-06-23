package com.blankyin.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.helpers.XMLUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * 自定义拦截器,SoapHeader设置<br>
 * <code>
 * <soap:Header>
 *     <authentication> 
 *         <username>admin</username>
 *         <password>123456</password> 
 *     </authentication>
 * </soap:Header>
 * </code>
 */
public class AddHeaderInterceptor extends
		AbstractPhaseInterceptor<SoapMessage> {

	public static final String XML_AUTH_AUTHENTICATION = "authentication";
	public static final String XML_AUTH_USERNAME = "username";
	public static final String XML_AUTH_PASSWORD = "password";

	private String username;
	private String password;

	public AddHeaderInterceptor(String username, String password) {
		super(Phase.PREPARE_SEND);
		this.username = username;
		this.password = password;
	}

	public void handleMessage(SoapMessage message) throws Fault {
		System.out.println("SoapHeaderInterceptor start ......");
		
		List<Header> headers = message.getHeaders();

		// 创建Doc
		Document doc = DOMUtils.createDocument();
		Element usernameEl = doc.createElement(XML_AUTH_USERNAME);
		usernameEl.setTextContent(this.username);
		Element passwordEl = doc.createElement(XML_AUTH_PASSWORD);
		passwordEl.setTextContent(this.password);

		Element root = doc.createElement(XML_AUTH_AUTHENTICATION);
		root.appendChild(usernameEl);
		root.appendChild(passwordEl);

		// 打印DOM
		XMLUtils.printDOM(root);

		SoapHeader header = new SoapHeader(new QName("hello"), root);
		headers.add(header);

		System.out.println("SoapHeaderInterceptor end ......");

	}

}
