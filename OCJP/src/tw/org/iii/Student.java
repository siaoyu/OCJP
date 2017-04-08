package tw.org.iii;

import java.io.Serializable;

public class Student implements Serializable {
	private int ch;
	private transient int math;
	private int eng;
	private String name;
	private Car Car;
	public Student(String name, int ch, int math, int eng){
		this.name = name;
		this.ch = ch;
		this.math = math;
		this.eng = eng;
		
		Car = new Car();
	}
	String getName(){return name;}
	double sum(){return ch+math+eng;}
	double avg(){return sum()/3;}
}
class Car implements Serializable{
	
}