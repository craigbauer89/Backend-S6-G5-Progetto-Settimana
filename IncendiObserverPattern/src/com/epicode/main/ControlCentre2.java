package com.epicode.main;

public class ControlCentre2 implements Observer {

	@Override
	public void update(URL url) {
		System.out.println("URLControlCentre2 :: " + url.getUrl());
		
	}

}
