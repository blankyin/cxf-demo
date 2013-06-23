package com.blankyin.cxf;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.blankyin.cxf.impl.HelloWorldImplService;
import com.blankyin.interceptor.AddHeaderInterceptor;

public class CXFClient {

	public static void main(String[] args) {
		HelloWorldImplService service = new HelloWorldImplService();
		HelloWorld hw = service.getHelloWorldImplPort();

		Client client = ClientProxy.getClient(hw);
		// Éè¶¨À¹½ØÆ÷
		client.getOutInterceptors().add(
				new AddHeaderInterceptor("admin", "admin"));
		client.getOutInterceptors().add(new LoggingOutInterceptor());

		String content = hw.sayHi("Jim");
		System.out.println(content);

		List<Person> list = hw.getListPersons();
		System.out.println(list);

		MapConvertor mc = hw.getMapPersons();
		System.out.println(mc.getEntries());
	}

}
