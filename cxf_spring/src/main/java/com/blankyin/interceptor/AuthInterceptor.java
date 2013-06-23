package com.blankyin.interceptor;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.common.util.CollectionUtils;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * 自定义拦截器,Header验证<br>
 * <code>
 * <soap:Header>
 *     <authentication> 
 *         <username>admin</username>
 *         <password>123456</password> 
 *     </authentication>
 * </soap:Header>
 * </code>
 */
public class AuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
	public static final String XML_AUTH_USERNAME = "username";
	public static final String XML_AUTH_PASSWORD = "password";

	public AuthInterceptor() {
		super(Phase.PRE_INVOKE);
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		System.out.println("AuthInterceptor start ......");

		// 获取SOAP消息头
		List<Header> headers = message.getHeaders();
		if (CollectionUtils.isEmpty(headers)) {
			throw new Fault(new IllegalArgumentException("SOAP消息头为空！"));
		}

		for (Header header : headers) {
			Element element = (Element) header.getObject();
			System.out.println("element:" + element);

			NodeList usernameNodes = element
					.getElementsByTagName(XML_AUTH_USERNAME);
			NodeList passwordNodes = element
					.getElementsByTagName(XML_AUTH_PASSWORD);
			System.out.println("usernameNodes:" + usernameNodes);
			System.out.println("passwordNodes:" + passwordNodes);

			if (usernameNodes == null || usernameNodes.getLength() == 0
					|| passwordNodes == null || passwordNodes.getLength() == 0) {
				throw new Fault(new IllegalArgumentException("用户名或密码为空！"));
			}

			String username = usernameNodes.item(0).getTextContent();
			String password = passwordNodes.item(0).getTextContent();

			System.out.println("username:" + username);
			System.out.println("password:" + password);

			if ("admin".equals(username) && "123456".equals(password)) {
				System.out.println("AuthInterceptor success ......");
			} else {
				throw new Fault(new IllegalArgumentException("用户名或密码错误！"));
			}

		}

		System.out.println("AuthInterceptor end ......");
	}
}
