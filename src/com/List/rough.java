package com.List;

import java.util.ArrayList;
import java.util.List;

public class rough {

	List<String> mark_list = new ArrayList<>();
	ArrayList<ArrayList<String>> TimeTable = new ArrayList<ArrayList<String>>();
		

	public void table1 () {
			
		TimeTable.add(new ArrayList<String>());
		TimeTable.get(0).add(0, "Monday");
		TimeTable.get(0).add(1, "Tuesday");
		TimeTable.get(0).add(2, "Wednesday");
		TimeTable.get(0).add(3, "Thursday");
		TimeTable.get(0).add(4, "Friday");
		TimeTable.get(0).add(5, "\n");


		TimeTable.add(new ArrayList<String>());
		TimeTable.get(1).add(0, "Physics");
		TimeTable.get(1).add(0, "Chemistry");
		TimeTable.get(1).add(0, "Computer science");
		TimeTable.get(1).add(0, "Maths");
		TimeTable.get(1).add(0, "English");
		/*TimeTable.get(5).add(0, "Subect1");
		TimeTable.get(6).add(0, "Subect1");


		*/
		
	System.out.println(TimeTable);
	}
	
	public static void main(String[] args) {
		rough Arr = new rough();
		Arr.table1 ();
	}
}


