package com.pool.l1.util.cmr.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentLibMap {
	public static void main(String[] args) {
		//basicFunctionality();
		//Map<String, Integer> map=new LinkedHashMap<>();
		Map<String, Integer> map=new LinkedHashMap<>();
		map.put("Z", 100);
		map.put("r", 15);
		map.put("W", 12);
		map.put("C", 24);
		map.forEach((key,value)->System.out.println("Key:"+key+",Value:"+value));
		/*for (Map.Entry<String, Integer> names : map.entrySet()) {
			System.out.println("Key:"+names.getKey()+",Value:"+names.getValue());
		}*/
	}
	private static void basicFunctionality() {
		Map<String, Integer> map = extracted();
		System.out.println("Ravi:"+map.get("Ravi"));
		System.out.println("Shiva:"+map.get("Shiva"));
		
		System.out.println("Satish:"+map.get("Satish"));
		
		if(map.containsKey("Satish")) {
			System.out.println("Satish is available in map");
		}else {
			System.out.println("Satish is Not available in map");
		}
		
		if(map.containsValue(100)) {
			System.out.println("100 is available in map");
		}else {
			System.out.println("100 is Not available in map");
		}
		/*
		 * for (Map.Entry<String, Integer> playerDetaisl : map.entrySet()) {
		 * System.out.println(playerDetaisl); }
		 */
	}
	private static Map<String, Integer> extracted() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Ravi", 100);
		map.put("Shiva", 100);
		map.put("Dawan", 200);
		map.put("Rohith", 250);
		return map;
	}
}
