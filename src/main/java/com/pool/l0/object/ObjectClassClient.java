package com.pool.l0.object;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ObjectClassClient {
	public static void main(String[] args) {
		//objectgetClassMethod();
		
		//teaGetClassMethod();
		//toStringFunctionality();
		//hashcodeFunctionality(object);
	}

	private static void teaGetClassMethod() {
		Tea masalaTea = new Tea("Masala", 10.40);
		System.out.println(masalaTea.getClass());
		Method[] methods = masalaTea.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
			//System.out.println(methods[i].getModifiers());
			Parameter[] parameters = methods[i].getParameters();
			for (int j = 0; j < parameters.length; j++) {
				System.out.println(parameters[j].getName());
				System.out.println(parameters[j].getType());
			}
		}
	}

	private static void objectgetClassMethod() {
		Object object = new Object();
		Method[] methods=object.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
	}

	private static void toStringFunctionality() {
		Tea masalaTea = new Tea("Masala", 10.40);
		System.out.println(masalaTea.toString());
	}

	private static void hashcodeFunctionality(Object object) {
		hashcodeMethod(object);
		Tea masalaTea = new Tea("Masala", 10.40);
		masalaTeaAddress("Masala",masalaTea);
		Tea gngerTea = new Tea("Ginger", 11.00);
		masalaTeaAddress("Ginger",gngerTea);
		gngerTea=masalaTea;
		masalaTeaAddress("Ginger",gngerTea);
		masalaTeaAddress("Masala",masalaTea);
	}

	private static void masalaTeaAddress(String teatTye,Tea masalaTea) {
		int addressOfMasalaTea=masalaTea.hashCode();
		System.out.println(teatTye+":"+addressOfMasalaTea);
	}

	private static void hashcodeMethod(Object object) {
		//hashcode 
		int addressOfObject=object.hashCode();
		System.out.println("Addrees:"+addressOfObject);
	}
}
