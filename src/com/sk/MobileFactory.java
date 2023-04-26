package com.sk;

public class MobileFactory {

	Mobile createMobile(String type) {
		Mobile mob = null;

		if ("lenovo".equalsIgnoreCase(type)) {
			mob = new Lenovo();
			System.out.println("Lenovo mobile created");
		} else if ("oneplus".equalsIgnoreCase(type)) {
			mob = new OnePlus();
			System.out.println("OnePlus mobile created");
		}

		return mob;
	}
}
