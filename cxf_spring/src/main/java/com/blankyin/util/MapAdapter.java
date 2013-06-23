package com.blankyin.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.blankyin.beans.Person;
import com.blankyin.util.MapConvertor.MapEntry;

/**
 * MapConvertor��ת���� <br>
 * Map<String, Person>����Ҫת��������
 */
public class MapAdapter extends XmlAdapter<MapConvertor, Map<String, Person>> {

	@Override
	public Map<String, Person> unmarshal(MapConvertor v) throws Exception {
		Map<String, Person> map = new HashMap<String, Person>();
		List<MapEntry> entries = v.getEntries();
		for (MapEntry entry : entries) {
			map.put(entry.getKey(), (Person) entry.getValue());
		}
		return map;
	}

	@Override
	public MapConvertor marshal(Map<String, Person> v) throws Exception {
		MapConvertor mc = new MapConvertor();
		for (Map.Entry<String, Person> entry : v.entrySet()) {
			mc.addEntry(new MapConvertor.MapEntry(entry.getKey(), entry
					.getValue()));
		}
		return mc;
	}

}
