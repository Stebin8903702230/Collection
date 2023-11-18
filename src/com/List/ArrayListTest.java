package com.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	List<Integer> mark_list = new ArrayList<>();
		public void arrList () {
			mark_list.add(100);
			mark_list.add(75);
			mark_list.add(50);
			mark_list.add(25);
			mark_list.add(null);
			mark_list.add(0);
		System.out.println(mark_list);
		System.out.println(mark_list.size());
		System.out.println(mark_list.get(2));
		System.out.println(mark_list.contains(80));
		System.out.println(mark_list.indexOf(25));
		System.out.println(mark_list.lastIndexOf(25));
				
		boolean add = mark_list.add(32);					// using Return type print (Ctrl + 2, then L)
		System.out.println(add);							// add is a Boolean
		System.out.println(mark_list);

		Integer remove = mark_list.remove(6);
		System.out.println(remove);
		System.out.println(mark_list);
		
		for (int i=0; i<mark_list.size(); i++) {
			System.out.println(mark_list.get(i) + " ");
		}
		System.out.println();
		
		for (int i=1; i<5; i++	) {
			System.out.print(mark_list.get(i) + " ");
		}
		System.out.println();
		
		for (Integer i: mark_list) {
			System.out.println(i);
		}
		
		
		}
		
		
		public void arrList1 () {
			mark_list.set(4, 15);
			mark_list.set(5, 10);
			System.out.println(mark_list);
		}
		public static void main(String[] args) {
			ArrayListTest Arr = new ArrayListTest();
			Arr.arrList();
			Arr.arrList1();
		}
}
