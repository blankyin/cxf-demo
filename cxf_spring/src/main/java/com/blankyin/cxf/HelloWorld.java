package com.blankyin.cxf;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.blankyin.beans.Person;
import com.blankyin.util.MapAdapter;

@WebService
public interface HelloWorld {

	/**
	 * �����������Ͳ���
	 */
	String sayHi(String text);

	/**
	 * List��JavaBean����
	 */
	List<Person> getListPersons();

	/**
	 * Map���ԣ�CXF�޷�����Map���ͣ���Ҫ�Զ���ת����
	 */
	@XmlJavaTypeAdapter(MapAdapter.class)
	Map<String, Person> getMapPersons();
}
