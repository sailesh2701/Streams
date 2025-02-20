package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> duplicates = getList();

		Set<Integer> seen = new HashSet<>();
		// Approach 1
		Set<Integer> duplicateSet = duplicates.stream().filter(n -> !seen.add(n)).collect(Collectors.toSet());
		// If add() returns false, it's a
		// duplicate
		System.out.println("Duplicate elements: " + duplicateSet);

		// Approach 2 Complex
		Set<Integer> findDuplicates = duplicates.stream()
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()))
				.entrySet().stream()
				.filter(s -> s.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());
		System.out.println("Duplicate elements 2: " + findDuplicates);

		/**
		 * keySet() ---> When you only need keys Needs an extra
		 * map.get(key) call to fetch values. 
		 * entrySet() ---> When you need both keys and
		 * values More efficient (avoids extra lookup)
		 **/

	}

	private static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(12);
		list.add(2);
		list.add(3);
		list.add(22);
		list.add(13);
		list.add(3);
		list.add(2);
		list.add(23);
		list.add(3);
		System.out.println("All Elements are: " + list);
		return list;
	}

}
