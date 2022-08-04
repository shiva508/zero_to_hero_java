package com.pool.l1.util.cmr.map;

import java.util.HashMap;
import java.util.Map;

public class StudentLibMap {
	public static void main(String[] args) {
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
