package com.blankyin.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Map转换器
 */
public class MapConvertor {
	private List<MapEntry> entries = new ArrayList<MapEntry>();

	public void addEntry(MapEntry entry) {
		entries.add(entry);
	}

	public List<MapEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<MapEntry> entries) {
		this.entries = entries;
	}

	/**
	 * Entry内部类，用于保存Map数据
	 */
	static class MapEntry {
		private String key;
		private Object value;

		public MapEntry() {
			super();
		}

		public MapEntry(String key, Object value) {
			super();
			this.key = key;
			this.value = value;
		}

		public MapEntry(Map.Entry<String, Object> entry) {
			super();
			this.key = entry.getKey();
			this.value = entry.getValue();
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}
	}
}
