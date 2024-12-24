package com.DuplicateFinderAndAnalyser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class AddFunc {
   ArrayList<String> list=new ArrayList<String>();
	void add(String n) {
		list.add(n);
	}
	void showdata() {
		System.out.println(list);
	}
	void identifyDuplicate() {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for (String string : list) {
			hm.put(string, hm.getOrDefault(string, 0)+1);
		}
		for (Entry<String, Integer> string : hm.entrySet()) {
			if(string.getValue()>1) {
				System.out.println(string);
			}
		}
		
	}
	void UniqueEl() {
		HashSet<String> hs = new HashSet<String>(list);
		System.out.println(hs);
	}
	void FrequencyCount() {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for (String string : list) {
			hm.put(string, hm.getOrDefault(string, 0)+1);
		}
		System.out.println(hm);
	}
}
