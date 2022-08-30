package com.pool.l0.iostreams.fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClient {
	public static final String FILE_NAME = "/home/shiva/shiva/mywork/zero_to_hero_java/src/main/java/resources/io.txt";

	public static void main(String[] args) {
		try {
			usingStringPath();
			//usingFileObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void usingFileObject() throws FileNotFoundException {
		StringBuilder builderData = new StringBuilder();
		try {
			File inputFileObje = new File(FILE_NAME);
			FileInputStream fileInputStream = new FileInputStream(inputFileObje);
			// READING DATA
			int initData = fileInputStream.read();
			while (initData != -1) {
				char charData = (char) initData;
				builderData.append(charData);
				initData = fileInputStream.read();
			}

			fileInputStream.close();

			System.out.println(builderData.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void usingStringPath() throws FileNotFoundException {
		StringBuilder builderData = new StringBuilder();

		try {
			FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
			while (fileInputStream.available()>0) {
				char charData = (char) fileInputStream.read();
				builderData.append(charData);

			}
			fileInputStream.close();

			System.out.println(builderData.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
