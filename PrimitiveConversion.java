package com.askourtutors.learnJavaPart4;

public class PrimitiveConversion {
	public static void main(String[] args) {
		int myInt = 5;
		float myFloat = myInt;
		System.out.println("myInt : " + myInt);
		System.out.println("myFloat : " + myFloat);
		
		float newFloat = 5.5f;
		int newInt = (int) newFloat;
		System.out.println("newFloat : " + newFloat);
		System.out.println("newInt : " + newInt);
		
		int otherInt = 130;
		byte myByte = (byte) otherInt;
		System.out.println("otherInt : " + otherInt);
		System.out.println("myByte : " + myByte);
	}

}
