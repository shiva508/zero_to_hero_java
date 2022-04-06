package com.pool.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".S");
		Matcher matcher = pattern.matcher("as");
		boolean doseitmatch = matcher.matches();
		System.out.println(doseitmatch);
		// 1st way
		Pattern p = Pattern.compile(".s");// . represents single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();

		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean b3 = Pattern.matches(".s", "as");

		System.out.println(b + " " + b2 + " " + b3);
	}
}
