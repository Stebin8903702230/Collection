package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

		public void hashTest() {
			Map<String, Integer> nameId = new HashMap<>();				// <Key - String, Value - Integer>
							nameId.put("Lixon Mandro", 100);
							nameId.put("Antony", 75);
							nameId.put("Sandy", 50);
							nameId.put("Antony", 25);
							nameId.put("Johnson", 10);
							nameId.put("Michel", null);
							nameId.put("Updated Null", null);
							nameId.put("lionel", 50);
							nameId.put("Antony", 50);
							nameId.put(null, 0);
							
							
		System.out.println("1."+ nameId);			// Random Order , No duplicate keys but allows duplicate values, only one null keyword but multiple null values.
		
		int size = nameId.size();				
		System.out.println("2."+ size);
		
		boolean containsKey = nameId.containsKey("Antony");	
		System.out.println("3."+ containsKey);
		
		boolean containsValue = nameId.containsValue(50100);	
		System.out.println("4."+ containsValue);
		
		Integer integer = nameId.get("Antony");
		System.out.println("5."+ integer);
		
		Integer remove = nameId.remove("Lionel");
		System.out.println("6."+ remove);
		
		boolean remove2 = nameId.remove("Updated Null", null);
		System.out.println("7."+ remove2);
		System.out.println("8."+ nameId);
		
		Integer replace = nameId.replace(null, 40);
		System.out.println("9."+ replace);
		System.out.println("10."+ nameId);
		
		Set<Entry<String, Integer>> entrySet = nameId.entrySet();		// All Keys and Values with Set Property (Square Bracket)
		System.out.println("11."+ entrySet);
		
		Set<String> keySet = nameId.keySet();							// only Key with Set Properties
		System.out.println("12."+ keySet);
		
		Collection<Integer> values = nameId.values();					// only values with common collection properties.
		System.out.println("13."+ values);

// Key Iterator															// (for-loop, for-each, ListIterator cannot be used here.)
		System.out.println("\n14. Key - Iterating");
		Iterator<String> itr1 = keySet.iterator();
		while (itr1.hasNext()) {
			System.out.println("   "+ itr1.next());
		}
		
// Value Iterator
		System.out.println("\n15. Value - Iterating");
		Iterator<Integer> itr2 = values.iterator();
		while (itr2.hasNext()) {
			System.out.println("   "+ itr2.next());
		}

// EntrySet forEach
		System.out.println("\n16. EntrySet - ForEach");
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e.getKey() +"\t\t" + e.getValue());
		}
	}
		public static void main(String[] args) {
			HashMapTest h = new HashMapTest();
			h.hashTest();
		}
		
		
}
