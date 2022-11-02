package com.training.exproject.package1;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Train> trains = new ArrayList<Train>();
	private char[] numberTrain; 
	
	public Group () {
		
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
	public void add (Train vb) {
		trains.add(vb);
	}

	@Override
	public String toString() {
		return "Group [trains=" + trains + "]";
	}
	
	public void infoByNumber(int n) {
		for (Train i : trains) {
			if (n == i.getNumberTrain()) {
				System.out.print("\n" + i.toString());
			}
		}
	}
}
