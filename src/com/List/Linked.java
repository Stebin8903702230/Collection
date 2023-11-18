package com.List;

import java.util.LinkedList;
import java.util.List;

public class Linked {
	
	public void linkedList() {
		List<String> LL = new LinkedList<>();
		
			LL.add("Apple");
			LL.add("Ball");
			LL.add("Cat");
			LL.add("Dog");
			LL.add(null);
			LL.add("Lion");
			LL.add("Lion");
			LL.add("Lion");
			LL.add("Fish");
			LL.add("Zebra");
			LL.add("Goat");
			
			System.out.println(LL);
			System.out.println(LL.size());
			System.out.println(LL.get(2));
			System.out.println(LL.contains("Zebra"));
			System.out.println(LL.indexOf("Lion"));
			System.out.println(LL.lastIndexOf("Lion"));
					
			boolean add = LL.add("Elephant");					// using Return type print (Ctrl + 2, then L)
			System.out.println(add);							// add is a Boolean
			System.out.println(LL);
		
			String remove = LL.remove(5);
			System.out.println(remove);
			System.out.println(LL);
			
			String set = LL.set(4, "Elephant");
			System.out.println(set);
			System.out.println(LL);
			
			for (int i=0; i<LL.size(); i++) {
				System.out.print(LL.get(i) + " ");
			}
			System.out.println();
			
			for (int i=1; i<5; i++	) {
				System.out.println(LL.get(i) + " ");
			}
			System.out.println();
			
			for (String a: LL) {
			System.out.print(a+"  ");
			}
	}
			public static void main (String[] args) {
				Linked l	= new Linked();
				l.linkedList();
			}
}
