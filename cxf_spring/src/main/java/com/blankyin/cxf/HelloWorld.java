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
	 * 基本数据类型测试
	 */
	String sayHi(String text);

	/**
	 * List、JavaBean测试
	 */
	List<Person> getListPersons();

	/**
	 * Map测试：CXF无法处理Map类型，需要自定义转换器
	 */
	@XmlJavaTypeAdapter(MapAdapter.class)
	Map<String, Person> getMapPersons();
}
