package com.epicode.main;

public class ControlCentre1 implements Observer {

	@Override
	public void update(URL url) {
		System.out.println("URLControlCentre1 :: " + url.getUrl());
		
	}
	
	

}
