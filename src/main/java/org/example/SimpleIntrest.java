package org.example;

public class SimpleIntrest {
	public double calculateSI(Double principle, double rate,double invalid) {
		if(principle <= 0 || rate <= 0|| invalid<= 0) {
			throw new IllegalArgumentException("Principle, rate and time musst be grater then 0");
		}
		return (principle * rate * invalid)/100;
	}

}
