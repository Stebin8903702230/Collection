package com.List;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	
	public void vec() {
		List<Integer> v = new Vector<>();
		v.add(500);
		v.add(400);
		v.add(300);
		v.add(200);
		v.add(200);
		v.add(null);
		v.add(25);
		v.add(10);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.get(2));
		System.out.println(v.contains(250));
		System.out.println(v.indexOf(10));
		System.out.println(v.lastIndexOf(10));
				
		boolean add = v.add(250);					
		System.out.println(add);							
		System.out.println(v);
	
		Integer remove = v.remove(3);
		System.out.println(remove);
		System.out.println(v);
		
		Integer set = v.set(4, 100);
		System.out.println(set);
		System.out.println(v);
		
		for (int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		for (int i=1; i<5; i++	) {
			System.out.println(v.get(i) + " ");
		}
		System.out.println();
		
		for (Integer a: v) {
		System.out.print(a+"  ");
		}
		
	}

	
	public static void main (String[] args) {
		VectorTest vt = new VectorTest();
		vt.vec();
	}
}
