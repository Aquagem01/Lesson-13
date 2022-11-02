package com.training.exproject.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Train b01 = new Train ("Brest", 11, 12.34);
		Train b02 = new Train ("Gomel", 18, 13.45);
		Train b03 = new Train ("Vitebsk", 21, 16.12);
		Train b04 = new Train ("Mogilev", 43, 08.17);
		Train b05 = new Train ("Brest", 54, 17.21);
		Train b06 = new Train ("Mogilev", 11, 08.15);
		Train b07 = new Train ("Brest", 11, 23.45);
		
				
		List<Train> trains = new ArrayList<Train>();
		trains.add(b01);
		trains.add(b02);
		trains.add(b03);
		trains.add(b04);
		trains.add(b05);
		trains.add(b06);
		trains.add(b07);
		
				
		for (Train i : trains) {
			i.print();
		}
		System.out.println();
		
		//////Добавьте возможность вывода информации о поезде, номер которого введен пользователем.///////
		 
		int number = 11;
		
		for (Train i : trains) {
			if (number == i.getNumberTrain()) {
				i.print();
			}
			
		}
		////////////////////////
		
		
		/////Добавьте возможность сортировки элементов коллекции по номерам поездов.////////
		
		sortByNumber(trains);
		
		System.out.println();
		for (Train i : trains) {
				i.print();
		}	
		////////////////////////
		
		/////Добавьте возможность сортировки коллекции по пункту назначения, причем поезда с одинаковыми пунктами назначения 
		//// должны быть упорядочены по времени отправления	
		
		sortByDestination(trains);
		System.out.println();
		for (Train i : trains) {
			i.print();
	}	
		
		
	}	
		
		
	public static void sortByNumber(List<Train> tr) {
		boolean flag = false;
		while (!flag) {
		flag = true;
			for (int i = 0; i < tr.size()-1; i++) {
				if (tr.get(i+1).getNumberTrain()<tr.get(i).getNumberTrain()) {
				Train temp = new Train();
				temp = tr.get(i);
				tr.set(i, tr.get(i+1));
				tr.set(i+1, temp);
					flag = false;
				}	
			}
		}
	}
	
	public static void sortByDestination (List<Train> trn) {
		int next = 0;
		for (int j = 0; j < trn.size()-1; j++) {
			next = j+1;
			for (int i = next; i < trn.size(); i++) {
			if (trn.get(i).getDestination() == trn.get(j).getDestination()) {
				Train temp = new Train();
				temp = trn.get(next);
				trn.set(next, trn.get(i)); 
				trn.set(i, temp);
				
			}
			}
		}
		/*for (int g = 0; g < trn.size()-1; g++){
			if (trn.get(g).getDestination() == trn.get(g+1).getDestination()) {
			} 	if (trn.get(g).getDepartureTime() > trn.get(g+1).getDepartureTime()){
					Train temp1 = trn.get(g);
					trn.set(g, trn.get(g+1));
					trn.set(g+1, temp1);
				}
		}*/
		
	}

}
