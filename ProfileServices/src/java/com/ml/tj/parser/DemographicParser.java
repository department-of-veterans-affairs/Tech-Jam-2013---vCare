package com.ml.tj.parser;

import java.util.Map;
import java.util.Scanner;


public class DemographicParser extends Parser{
	
	
	public DemographicParser(String[] listObject , String type){
		this.listObject = listObject;
		this.type = type;
	}

	public String parse(Scanner s, Map<String, String> map) {
		
		while (s.hasNext()){
			String k = s.nextLine();
			if (isComplete(k)){
				return k;
			}
			if(k.indexOf(":") > 1){
				if (k.indexOf("Gender:") > 1){
					
				}else{
					String[] p = k.split(":");
					if (p.length > 1){
						map.put(p[0].replaceAll(" ", ""), p[1]);
						parselist.add(new KeyPair(p[0], p[1]));
					}
				}
			}
			//System.out.println(type + k );
		}
		return "";
 	}

}
