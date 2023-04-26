package com.sk;

public class MobileFactoryDemo {

	public static void main(String[] args) {

		MobileFactory mobileFactory = new MobileFactory();
		
		Mobile mobile = mobileFactory.createMobile("lenovo");
		mobile.aboutMobile();
		
		Mobile mobile2 = mobileFactory.createMobile("oneplus");
		mobile2.aboutMobile();
		
	}

}
