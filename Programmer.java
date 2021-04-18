package com.askourtutors.learnJavaPart4;

public class Programmer extends Employee {
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}

	@Override
	public int getSalary() {
		return super.getSalary() + 3;
	}

	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!!!");
	}

	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!!! ");
	}

}
