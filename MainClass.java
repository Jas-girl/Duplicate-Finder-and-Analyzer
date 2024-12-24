package com.DuplicateFinderAndAnalyser;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	AddFunc a=new AddFunc();
	Scanner sc=new Scanner(System.in);
	System.out.println("How many values you have to enter");
	int choice =sc.nextInt();
	for (int i = 0; i < choice; i++) {
		System.out.println("Add some string values");
		a.add(sc.next());
	}
	System.out.println("Display all data");
	a.showdata();
	System.out.println("Find the duplicates");
	a.identifyDuplicate();
	System.out.println("Find the unique elements");
	a.UniqueEl();
	System.out.println("Frequency count");
	a.FrequencyCount();
	
	
}
}
