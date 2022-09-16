package com.epicode.main;

public interface Subject {
	
	 public void add(Observer o);
	    public void remove(Observer o);
	    public void notifyFire(URL url);

}
