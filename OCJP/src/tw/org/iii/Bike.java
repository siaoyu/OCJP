package tw.org.iii;

public class Bike {
	int a;
	static int b;
	static int counter;
//	private double speed;
	double speed;
	Bike(){
		this(0);
	}
	Bike(int s){
		this(s*1f);
	}
	Bike(float s){
		this(s*1.0);
	}
	Bike(double s){
		speed = s;
		a++; counter++;
		System.out.println("Bike:Bike()");
	}
	void upSpeed(){
		speed = (speed<1)?1:(speed*1.2);
	}
	void downSpeed(){
		speed *= 0.7;
	}
	double getSpeed(){
		return speed;
	}
}
