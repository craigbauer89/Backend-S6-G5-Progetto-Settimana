package com.epicode.main;

public class MainProgram {

	public static void main(String[] args) {
		
		 ControlCentre1 c1 = new ControlCentre1();
		 ControlCentre2 c2 = new ControlCentre2();
	     
	         
	        Sonda s = new Sonda();	
	         
	        s.add(c1);
	        
	        
	         
	        s.notifyFire(new URL("Fire at Sonda 1"));   //s1 and s2 will receive the update
	         
	        s.remove(c1);
	        s.add(c2);
	        
	         
	        s.notifyFire(new URL("Fire at Sonda 1")); //s2 and s3 will receive the update
	}

}
