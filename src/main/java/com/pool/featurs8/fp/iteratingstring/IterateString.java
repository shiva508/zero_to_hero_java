package com.pool.featurs8.fp.iteratingstring;

public class IterateString {
	public static void main(String[] args) {
		final String str = "w00t";
		str.chars().forEach(System.out::println);
		str.chars().forEach(IterateString::printChar);
		str.chars().mapToObj(charData->Character.valueOf((char)charData)).forEach(System.out::println);
		str.chars().filter(charData->Character.isDigit(charData)).forEach(ch->printChar(ch));
		str.chars().filter(Character::isDigit).forEach(IterateString::printChar);
		
	}
	
	private static void printChar(int charData) {
		System.out.println((char)(charData));
	}
}
