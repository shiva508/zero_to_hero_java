package com.pool.l3.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.pool.l3.reflection.annotation.Call;
import com.pool.l3.reflection.service.ProductService;

public class ReflectionSimulator2 {
	public static void main(String[] args) {

		String k = "com.dasari.reflection.service.ProductService";
		try {
			Class clazz=Class.forName(k);
			Constructor constructor=clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			Object obj=constructor.newInstance();
			Method [] methods=clazz.getDeclaredMethods();
			for(Method method:methods) {
				if(method.isAnnotationPresent(Call.class)) {
					method.invoke(obj);
				}
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
