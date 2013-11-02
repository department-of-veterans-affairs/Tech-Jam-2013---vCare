package com.techjam.parser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MilitaryHealthHistoryParser extends Parser{
	
	public String[] ignorelist = {"Work Phone Number"};
	
	public MilitaryHealthHistoryParser(String[] listObject , String type){
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
				}else if (k.startsWith("Service Branch:")){
					Pattern p = Pattern.compile("Service Branch: (.*) Rank:(.*)");
					Matcher matcher = p.matcher(k);
					matcher.find();
					parselist.add(new KeyPair("Service Branch", matcher.group(1)));					
					parselist.add(new KeyPair("Rank", matcher.group(2)));
				}else if (k.startsWith("Location of Service:")){
					Pattern p = Pattern.compile("Location of Service: (.*) Onboard Ship: (.*)");
					Matcher matcher = p.matcher(k);
					matcher.find();
					parselist.add(new KeyPair("Location of Service", matcher.group(1)));					
					parselist.add(new KeyPair("Onboard Ship", matcher.group(2)));
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
