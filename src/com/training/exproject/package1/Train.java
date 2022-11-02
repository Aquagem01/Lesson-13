package com.training.exproject.package1;

import java.util.Objects;

public class Train {
	private String destination;
	private int numberTrain;
	private double departureTime;
	
	public Train() {
		this.destination = "";
		this.numberTrain = 0;
		this.departureTime = 0.0;
	}
	
	public Train(String des, int num, double dep) {
		this.destination = des;
		this.numberTrain = num;
		this.departureTime = dep;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Train [destination= " + destination + ", numberTrain= " + numberTrain + ", departureTime= " + departureTime
				+ "]";
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}

	public void print() {
		System.out.print("\nDestination: "+this.destination+"\tNumber of train: "+this.numberTrain+"\tDeparture time: "+this.departureTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(departureTime, destination, numberTrain);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Double.doubleToLongBits(departureTime) == Double.doubleToLongBits(other.departureTime)
				&& Objects.equals(destination, other.destination) && numberTrain == other.numberTrain;
	}

	
	
	
	
}

