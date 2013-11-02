package com.ml.tj.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.XML;

public class BlueButtonXmltoJsonConverter {

	public static int PRETTY_PRINT_INDENT_FACTOR = 4;

	private String readFile(String path) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line;

		while ((line = br.readLine()) != null) {
			sb.append(line);
		}

		br.close();
		return sb.toString();
	}

	public String convertToJson(String xmlPath) throws Exception {
		JSONObject xmlJSONObj = XML
				.toJSONObject(readFile(xmlPath));
		String jsonPrettyPrintString = xmlJSONObj
				.toString(PRETTY_PRINT_INDENT_FACTOR);
		return jsonPrettyPrintString;
	}
	
	public JSONObject getJsonObject(String xmlPath) throws Exception {
		return XML
				.toJSONObject(readFile("C:\\TechJam\\BBXML.xml"));
	}
		
}
