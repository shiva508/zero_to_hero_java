package com.pool.l2.featurs8.functionalcoding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDataClient {
	public static void main(String[] args) {
		try {
			String searchword = "CHAPTER";
			String path = "/home/shiva/shiva/mywork/zero_to_hero_java/src/main/java/resources/war_and_peace.txt";
			long count = 0;

			BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains(searchword)) {
					count++;
				}
			}
			System.out.println("Search word repeated count:"+count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
