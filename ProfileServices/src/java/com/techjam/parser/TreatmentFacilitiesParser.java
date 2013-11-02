package com.techjam.parser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TreatmentFacilitiesParser extends Parser{
	
	public String[] ignorelist = {"Work Phone Number"};
	
	public TreatmentFacilitiesParser(String[] listObject , String type){
		this.listObject = listObject;
		this.type = type;
	}

	public String parse(Scanner s) {
		
		while (s.hasNext()){
			String k = s.nextLine();
			if (isComplete(k)){
				return k;
			}
			if(k.indexOf(":") > 1){
				if (k.startsWith("Phone Number:")){
					parselist.add(new KeyPair("Phone Number", k.substring(13)));
				}else if (k.startsWith("Facility Type:")){
					Pattern p = Pattern.compile("Facility Type:(.*) VA Home Facility: (.*)");
					Matcher matcher = p.matcher(k);
					matcher.find();
					parselist.add(new KeyPair("Facility Type", matcher.group(1)));					
					parselist.add(new KeyPair("VA Home Facility", matcher.group(2)));
				}else{
					String[] p = k.split(":");
					if (p.length > 1){
						parselist.add(new KeyPair(p[0], p[1]));
					}
				}
			}
			//System.out.println(type + k );
		}
		return "";
 	}

}
