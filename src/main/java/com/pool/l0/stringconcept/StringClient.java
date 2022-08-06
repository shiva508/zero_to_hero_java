package com.pool.l0.stringconcept;

public class StringClient {
	public static void main(String[] args) {
		// basicOperations();
		// contains();
		// chatAt();
		// startWithEndWith();
		// trimMethod();
		// upperAndLowercase();
		// splitMethod();
		// eualsAndEqualsIgnore();

	}

	private static void eualsAndEqualsIgnore() {
		String name1 = "Developer";
		String name2 = "developer";
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
	}

	private static void splitMethod() {
		String naturalwords = "or door prize entry for Venkat's Agile Learner site, or for a free JetBrains license, email denveropensource@gmail.com tonight. Include preference for \"AgileLearner\" and/or \"JetBrains\"";
		// String[] names =naturalwords.split("\s");
		// String[] names =naturalwords.split("o");
		String[] names = naturalwords.split("Learner");
		System.out.println("Names length" + names.length);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	private static void upperAndLowercase() {
		String fullname = "DaSari ShIva";
		System.out.println("Original:" + fullname);
		System.out.println("Lowercase:" + fullname.toLowerCase());
		System.out.println("Uppercase:" + fullname.toUpperCase());
	}

	private static void trimMethod() {
		String name = " Ravi AS ";
		System.out.println("Before trim length:" + name.length());
		System.out.println("After trim length:" + name.trim().length());
	}

	private static void startWithEndWith() {
		String fullname = "Dasari Bataman Superman Shiva";
		System.out.println("startsWith Dasari:" + fullname.startsWith("Dasari"));
		System.out.println("startsWith Shiva:" + fullname.startsWith("Shiva"));

		System.out.println("endsWith Dasari:" + fullname.endsWith("Dasari"));
		System.out.println("endsWith Shiva:" + fullname.endsWith("Shiva"));
	}

	private static void chatAt() {
		String esay = "ashgaashasgjQUSDADJSADGHAHD BDSDSGDS";
		System.out.println(esay.charAt(10));
	}

	private static void contains() {
		String esay = "ashgaashasgjQUSDADJSADGHAHD BDSDSGDS";

		// Contains()===>it checks if that is available==>true/false
		System.out.println(esay.contains("DAD"));
		System.out.println(esay.contains("Shiva"));
	}

	private static void basicOperations() {
		String name = "Ravi";// 100
		String ravi = "Ravi";// 101
		System.out.println("name:" + name + ", hashcode:" + name.hashCode());
		System.out.println("ravi:" + ravi + ", hashcode:" + ravi.hashCode());
		String auther = new String("Ravi");
		// ==,equals
		// == always comapres memeory location not content
		System.out.println(name == ravi);
		System.out.println(name == auther);
		System.out.println("======Using equals()");
		// equals method always comares the content
		System.out.println(name.equals(ravi));
		System.out.println(name.equals(auther));
	}
}
