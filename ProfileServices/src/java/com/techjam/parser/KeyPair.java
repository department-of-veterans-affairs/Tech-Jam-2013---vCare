package com.techjam.parser;

public class KeyPair {
	
	private String key;
	private String Value;

	public KeyPair(String key, String Value){
		this.key = key.trim();
		this.Value = Value.trim();
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	@Override
	public String toString() {
		return "" + key + ": \"" + Value + "\"" + "\n";
	}
	
}
