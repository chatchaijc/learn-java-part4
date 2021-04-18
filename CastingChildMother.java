package com.askourtutors.learnJavaPart4;

import java.util.ArrayList;

public class CastingChildMother {
	public static void main(String[] args) {
		Employee dang = new Employee("Dang", "DoumDee", 10000);
		Employee ceo = new CEO("Captan", "Marvel", 20000);
		Programmer prog = new Programmer("Captain", "Marvel", 30000);
		CEO ceo2 = (CEO) ceo;
		//
		//
		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(dang);
		myList.add(prog);
		CEO ceo3 = (CEO) myList.get(0);
		Employee dang2 = myList.get(1);
		Programmer prog2 = (Programmer) myList.get(2);
		ceo3.hello();
		prog2.hello();
		dang2.hello();
	}

}
