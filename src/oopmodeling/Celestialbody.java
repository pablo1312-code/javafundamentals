package oopmodeling;

public class Celestialbody {

//Protected: la pueden acceder sus derivados 

public float mass = 45;

//Public: accesible por cualquiera

float size = 28; 

//Private: solo para clase 
  
String name="Wachipa";

public float getMass() {
	return mass;
}

public void setMass(float mass) {
	this.mass = mass;
}

public float getSize() {
	return size;
}

public void setSize(float size) {
	this.size = size;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
