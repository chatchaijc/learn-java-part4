package com.askourtutors.learnJavaPart4;

public class TestProduct extends AbstractProductFrontPage {
	final String quality = "Gold";
	public ProductStatus.Status productStatus;
	public ProductStatus.PriceStatus priceStatus;
	public static void main(String[] args) {
		TestProduct pro = new TestProduct();
		//pro.quality = "Bad";
	}
	
	public final String getX() {
		return "X";
	}
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUrlImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSoldText() {
		// TODO Auto-generated method stub
		return null;
	}

}
