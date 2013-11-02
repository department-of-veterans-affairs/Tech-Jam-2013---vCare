package com.techjam.parser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DemographicParser extends Parser{
	
	public String[] ignorelist = {"Work Phone Number"};
	
	public DemographicParser(String[] listObject , String type){
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
				boolean ignore = false;
				for (String ignorestr : ignorelist) {
					if (k.startsWith(ignorestr)){
						ignore = true;
						break;
					}
				}
				if(ignore ){
					continue;
				}
				if (k.startsWith("Gender")){
					Pattern p = Pattern.compile("Gender:(.*) Blood Type: (.*) Organ Donor: (.*)");
					Matcher matcher = p.matcher(k);
					matcher.find();
					parselist.add(new KeyPair("Gender", matcher.group(1)));
					
					parselist.add(new KeyPair("Blood Type", matcher.group(2)));
					//matcher.find();
					parselist.add(new KeyPair("Organ Donor", matcher.group(3)));
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
