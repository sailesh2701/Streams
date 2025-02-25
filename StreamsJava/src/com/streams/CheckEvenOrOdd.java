package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		List<Integer> list = getList();

		System.out.println(
				list.stream().collect(Collectors.groupingBy(s -> s % 2 == 0 ? "Even" : "Odd", Collectors.counting())));

	}

	private static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(12);
		list.add(32);
		list.add(6);
		list.add(13);
		list.add(23);
		list.add(3);
		list.add(4);
		System.out.println("All Elements are: " + list);
		return list;
	}

}
