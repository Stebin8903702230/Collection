package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Combined {
	List<Integer> secA_Marklist = new ArrayList<>();	
	List<Integer> secB_Marklist = new LinkedList<>();
	List<Integer> secC_Marklist = new Vector<>();

		public void secA() {
					secA_Marklist.add(0);
					secA_Marklist.add(25);
					secA_Marklist.add(50);
					secA_Marklist.add(75);
					secA_Marklist.add(100);
					secA_Marklist.add(25);
					secA_Marklist.add(null);
		}
		public void SecB() {
					secB_Marklist.add(10);
					secB_Marklist.add(20);
					secB_Marklist.add(30);
					secB_Marklist.add(40);
					secB_Marklist.add(50);
					secB_Marklist.add(60);
					secB_Marklist.add(null);
		}
		public void SecC() {
					secC_Marklist.add(null);
					secC_Marklist.add(0);
					secC_Marklist.add(75);
					secC_Marklist.add(10);
					secC_Marklist.add(10);
					secC_Marklist.add(75);
					secC_Marklist.add(null);
		}
//addAll
		public void addAll() {
			System.out.println("addAll");
			System.out.println("SecA:"+secA_Marklist);
			System.out.println("SecB:"+secB_Marklist);
			System.out.println("SecC:"+secC_Marklist+"\n");
		
			System.out.println("Add secA with secB");
			secA_Marklist.addAll(secB_Marklist);
			System.out.println(secA_Marklist);
			
			System.out.println("Add secC with secB and secC");
			secC_Marklist.addAll(secA_Marklist);
			System.out.println(secC_Marklist+"\n");
		}
//removeAll	
		public void removeAll() {
			System.out.println("removeAll");
			System.out.println("SecA:"+secA_Marklist);
			System.out.println("SecB:"+secB_Marklist);
			System.out.println("SecC:"+secC_Marklist+"\n");
			
			System.out.println("Remove all the common values of secA with secB (50, null-removed)");
			secA_Marklist.removeAll(secB_Marklist);
			System.out.println(secA_Marklist);
			
			System.out.println("Remove all the common values of secC with only from the output(secA-secB) 0,75,75- removed.");
			secC_Marklist.removeAll(secA_Marklist);
			System.out.println(secC_Marklist+"\n");
		}
//retainAll		
		public void retainAll() {
			System.out.println("retainAll");
			System.out.println("SecA:"+secA_Marklist);
			System.out.println("SecB:"+secB_Marklist);
			System.out.println("SecC:"+secC_Marklist+"\n");
			
			System.out.println("Retain secA with secB");
			secA_Marklist.retainAll(secB_Marklist);
			System.out.println(secA_Marklist);	
			
			System.out.println("Retain secC with secA");
			secC_Marklist.retainAll(secA_Marklist);
			System.out.println(secC_Marklist);		
		}
//Iterator	
		public void iterator() {
		for (Integer a: secA_Marklist) {
			System.out.println(a);
			}
		
		System.out.println("Iterator");
		Iterator<Integer> itr = secA_Marklist.iterator();
		while(itr.hasNext()) {
			Integer next= itr.next();	
			System.out.println(next);
		}
		}
// ListIterator		
		public void listIterator() {
			ListIterator<Integer> itr = secB_Marklist.listIterator();
			
			System.out.println("Iterator");
			while(itr.hasNext()) {
			//	Integer next= itr.next();	
				System.out.println(itr.next());
				}
			System.out.println("\n\nList Iterator");
				while(itr.hasPrevious()) {
					System.out.println(itr.previous());
				}
			
		}
		public static void main (String[] args) {
			Combined C = new Combined();
			C.secA();
			C.SecB();
			C.SecC();
			C.addAll();
			C.removeAll();
			C.retainAll();
			C.iterator();
			C.listIterator();
		}
}
