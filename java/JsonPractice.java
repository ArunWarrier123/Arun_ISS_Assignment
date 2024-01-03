package com.demo;

import java.io.FileReader;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonPractice {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		JSONObject jsonObj = new JSONObject();

		jsonObj.put("Arun", "1");

		System.out.println(jsonObj);

		// reading from json file
		JSONParser parser = new JSONParser();

		try {
			FileReader fileReader = new FileReader("src/names.json");
			Object object = parser.parse(fileReader);

			JSONObject myObj = (JSONObject) object;

			System.out.println("final json object is " + myObj);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
