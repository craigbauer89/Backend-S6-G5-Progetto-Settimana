package com.epicode.main;

public class MainProgram {

	public static void main(String[] args) {
		
		 ControlCentre1 c1 = new ControlCentre1();
		 ControlCentre2 c2 = new ControlCentre2();
	     
	         
	        Sonda s1 = new Sonda((long) 1,36.385913, -127.441406, 8, true);	
	        Sonda s2 = new Sonda((long) 2,12.685902, -169.367593, 4, false);	
	         
	        
	       
	        
	        s1.add(c1);
	        s1.add(c2);
	        s2.add(c1);
	        s2.add(c2);
	        
	        if (s1.getIncendioSmokeLevel() >= 5) {
	        	s1.remove(c1);
	        	s1.remove(c2);
	        }
	        
	        if (s2.getIncendioSmokeLevel() >= 5) {
	        	s2.remove(c1);
	        	s2.remove(c2);
	        }
	         
	        s1.notifyFire(new URL(s1.getId() + " :: http://host/alarm?idsonda = [" + + s1.getId() + "]&lat = [ " + s1.getLatitude() + "]&lon=["+ s1.getLongitude() +"]&smokelevel=[" + s1.getIncendioSmokeLevel()));
	        s2.notifyFire(new URL(s2.getId() + " :: http://host/alarm?idsonda = [" + + s2.getId() + "]&lat = [ " + s2.getLatitude() + "]&lon=["+ s2.getLongitude() +"]&smokelevel=[" + s2.getIncendioSmokeLevel()));
	        
	        
	}

}
