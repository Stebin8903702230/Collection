package com.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListString {

	List<String> TimeTable = new ArrayList<>();
	
	public void Weeks () {
			
		TimeTable.add("Monday");
		TimeTable.add("Tuesday");
		TimeTable.add("Wednesday");
		TimeTable.add("Thursday");
		TimeTable.add("Friday");
		TimeTable.add(null);
		TimeTable.add("Physics");
		TimeTable.add("Chemistry");
		TimeTable.add("Maths");
		TimeTable.add("science");
		TimeTable.add("Computer");
		TimeTable.set(5, "Saturday");

	System.out.println(TimeTable);
	System.out.println();
	}
	
	public void Subjects () {
		for (int i = 0; i<TimeTable.size(); i++) {
		System.out.println(TimeTable.get(i));
	}
	}
	public static void main(String[] args) {
		ArrayListString Arr = new ArrayListString();
		Arr.Weeks();
		Arr.Subjects();

		
	}
}
