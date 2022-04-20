package com.pool.l2.featurs14.records;

public class RecordClient {
	public static void main(String[] args) {
		Person person = new Person("Shiva", "TMP");
		//SETTER 
		System.out.println(person.name());
		System.out.println(person);
		System.out.println(person.connverToUpperCase());
		Person.printStaticData();
	}
}
