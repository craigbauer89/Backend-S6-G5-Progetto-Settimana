package com.epicode.main;

import java.util.ArrayList;
import java.util.List;

public class Sonda implements Subject {
	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void add(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void remove(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyFire(URL url) {
		for(Observer o: observers) {
            o.update(url);
        }
		
	}

}
