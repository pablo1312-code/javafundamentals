




package taste;


import javax.net.ssl.ExtendedSSLSession;

import oopmodeling.Planet;

public class Test {
	public static void main(String[] args) {
		System.out.println(11652);
	int num1=1221;
	int num2=3215;
	System.out.println(num1 + num2);
	Star sun=new Star();
	Planet mars=new Planet();
	Planet saturno=new Planet();
	
	
	System.out.println(sun.mass);
	mars.setMass(3242);
	saturno.setSize(234);
	
	System.out.println("the mass of the planet is"+mars.getMass());
	//java.lang.NullPointerException 
	Star utus=null; 
	//==es el operador de comparacion de igualdad 
	if(utus==null) {
		
	}
	System.out.println("the mass of the utus is"+utus.getMass()); 
	
		
		
		
	}

}

