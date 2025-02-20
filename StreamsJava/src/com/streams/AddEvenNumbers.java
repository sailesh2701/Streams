package com.streams;

import java.util.ArrayList;
import java.util.List;

public class AddEvenNumbers {

	public static void main(String[] args) {

		List<Integer> list = getList();

		System.out.println(
				"Sum of even Numbers: " + list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum());
		// Using Lambda
		System.out.println(
				"Sum of even Numbers Second Approach: " + list.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum());

	}

	private static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(12);
		list.add(3);
		list.add(6);
		list.add(13);
		list.add(23);
		list.add(3);
		list.add(4);
		System.out.println("All Elements are: " + list);
		return list;
	}

}
