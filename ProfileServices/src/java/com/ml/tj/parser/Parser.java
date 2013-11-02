package com.ml.tj.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Parser {

	
	
	public  String[] listObject;
	
	public String type = "";
	
	public String parse(Scanner s, Map<String, String> map) {
		
		while (s.hasNext()){
			String k = s.nextLine();
			if (isComplete(k)){
				return k;
			}
			if(k.indexOf(":") > 1){
				String[] p = k.split(":");
				if (p.length > 1){
					map.put(p[0].replaceAll(" ", ""), p[1]);
					parselist.add(new KeyPair(p[0], p[1]));
				}
			}
			//System.out.println(type + k );
		}
		return "";
 	}

	protected boolean isComplete(String k) {
		for (String object : listObject) {
			if (k.indexOf(object) > 1){
				return true;
			}
		}
		return false;
	}

	protected List parselist = new ArrayList();

	public List getParselist() {
		return parselist;
	}


}
