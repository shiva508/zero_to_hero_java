package com.pool.l0.core.oops.clone;

import java.util.HashMap;
import java.util.Map;

public class CloningSimulator {
	public static void main(String[] args) throws CloneNotSupportedException {
		basicCloningFunctionality();
		//deepCloning();
		
	}

	private static void deepCloning() throws CloneNotSupportedException {
		Map<String, String> properties=new HashMap<>();
		properties.put("HI", "Shiva");
		properties.put("We", "Are");
		
		ImagesDeepClone imagesDeepClone=new ImagesDeepClone();
		imagesDeepClone.setImageName("Shiava.jpeg")
		.setImageId(200)
		.setImageProps(properties);
		ImagesDeepClone  cloned=(ImagesDeepClone)imagesDeepClone.clone();
		System.out.println("Before update Original object:"+cloned);
		imagesDeepClone.getImageProps().put("I am", "not done");
		System.out.println("After update Original object=: "+imagesDeepClone);
		System.out.println("After update Original object Cloned Object=:"+cloned);
	}

	private static void basicCloningFunctionality() throws CloneNotSupportedException {
		Images images=new Images();
		Map<String, String> props=new HashMap<>();
		props.put("Size","508MB");
		props.put("Format","jpg");
		images.setImageId(408)
			  .setImageName("Nithya.jpg")
		      .setImageProps(props);
		
		Images cloneImages=(Images) images.clone();
		images.setImageName("Shiav.jpg");
		System.out.println("Object Equality:"+(images==cloneImages));
		System.out.println("Props Equality:");
		System.out.println("ImageId:"+(images.getImageId()==cloneImages.getImageId()));
		System.out.println("ImageName:"+(images.getImageName().equals(cloneImages.getImageName())));
		System.out.println("Cloned object:"+cloneImages);
		//
		images.getImageProps().put("Lcation", "India");
		System.out.println("Cloned Image:"+cloneImages.getImageProps());
		
		//Changing name
		images.setImageName("Nithya New");
		System.out.println("Cloned:"+cloneImages.getImageName());
	}
}
