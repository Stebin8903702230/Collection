package com.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
			
			public void tST() {
				Set<String> Month = new TreeSet<>();
				Month.add("January");
				Month.add("February");
				Month.add("March");
				Month.add("April");
				Month.add("May");
			//	Month.add(null);		// null value not accepted.
				Month.add("June");
				Month.add("January");
				Month.add("January");
		
				System.out.println(Month);			// Ascending order & no repetition.
				System.out.println(Month.size());
			//	System.out.println(Month.get(2));
				System.out.println(Month.contains("August"));
			//	System.out.println(Month.indexOf("January"));
			//	System.out.println(Month.lastIndexOf("April"));
						
				boolean add = Month.add("December");					
				System.out.println(add);							
				System.out.println(Month);
			
				boolean remove = Month.remove("January");
				System.out.println(remove);
				System.out.println(Month);
				
				for (String a: Month) {
				System.out.print(a+"  ");
				}
				Iterator<String> itr = Month.iterator();
				while(itr.hasNext()) {
					String next= itr.next();
					System.out.println(next);
				}
	}
						public static void main (String [] args) {
							TreeSetTest ts = new TreeSetTest();
							ts.tST();
						}
}
