package com.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	
		public void hS() {
			Set<Integer> d = new HashSet<>();
			d.add(10);
			d.add(8);
			d.add(6);
			d.add(4);
			d.add(2);
			d.add(null);
			d.add(0);
			d.add(6);
			
			System.out.println(d);					//	Values executed in Ascending order.
			System.out.println(d.size());
		//	System.out.println(d.get(2));				No Index (Random store)
			System.out.println(d.contains(6));
		//	System.out.println(d.indexOf(10));
		//	System.out.println(d.lastIndexOf(10));
					
			boolean add = d.add(250);					
			System.out.println(add);							
			System.out.println(d);
								
			boolean remove = d.remove(null);
			System.out.println(remove);
			System.out.println(d);
			
			for (Integer a: d) {
				System.out.println(a);
				}
			
			d.clear();
			System.out.println(d);
			
			boolean empty = d.isEmpty();
			System.out.println(empty);
			System.out.println(d);
						
	}
			public static void main (String[] args) {
				HashSetTest Hs = new HashSetTest();
				Hs.hS();
			}
}
