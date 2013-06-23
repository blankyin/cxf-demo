package com.blankyin.cxf.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.blankyin.beans.Person;
import com.blankyin.cxf.HelloWorld;

@WebService(endpointInterface = "com.blankyin.cxf.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Override
	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}

	@Override
	public List<Person> getListPersons() {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("����", "������", 24));
		persons.add(new Person("����", "�人��", 33));
		persons.add(new Person("����", "�Ϻ���", 19));

		return persons;
	}

	@Override
	public Map<String, Person> getMapPersons() {
		Map<String, Person> map = new HashMap<String, Person>();
		map.put("1", new Person("Li Lei", "������", 14));
		map.put("2", new Person("Han Meimei", "�人��", 13));
		map.put("3", new Person("Jim Green", "�Ϻ���", 12));
		return map;
	}
}
