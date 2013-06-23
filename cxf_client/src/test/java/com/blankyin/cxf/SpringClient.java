package com.blankyin.cxf;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "cxf-client.xml" });
		HelloWorld hw = (HelloWorld) context.getBean("client");

		String content = hw.sayHi("Jim");
		System.out.println(content);

		List<Person> list = hw.getListPersons();
		System.out.println(list);

		MapConvertor mc = hw.getMapPersons();
		System.out.println(mc.getEntries());

	}

}
