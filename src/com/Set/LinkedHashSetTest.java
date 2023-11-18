package com.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	
			public void lh() {
				Set<String> l = new LinkedHashSet<>();
				l.add("Arm");
				l.add("Eye");
				l.add("Eye");
				l.add("Ear");
				l.add("Ear");
				l.add(null);
				l.add("leg");
				
				System.out.println(l);					// maintains insertion order & no repetition.
				System.out.println(l.size());
			//	System.out.println(l.get(2));
				System.out.println(l.contains("Hand"));
			//	System.out.println(l.indexOf("Ear"));
			//	System.out.println(l.lastIndexOf("Ear"));
						
				boolean add = l.add("nose");					
				System.out.println(add);						
				System.out.println(l);
			
				boolean remove = l.remove(null);
				System.out.println(remove);
				System.out.println(l);
				
				for (String a: l) {
				System.out.print(a+"  ");
				}
				
				System.out.println("\n\nIterator");
				Iterator<String> itr = l.iterator();
				while(itr.hasNext()) {
					String next= itr.next();		
					System.out.println(next);
				}
			
				
			}
				public static void main (String[] args) {
					LinkedHashSetTest n = new LinkedHashSetTest();
					n.lh();
				}
}
