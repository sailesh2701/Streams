package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringStartingWithChar {

	public static void main(String[] args) {
		List<String> getList = getStrings();

		System.out.println(getList.stream().filter(s -> (s.charAt(0) == 'S' || s.charAt(0) == 's')).count());
		System.out.println(getList.stream().filter(s -> (s.contains("s") || s.contains("S"))).count());

		System.out.println(getList.stream()// .filter(s -> (s.contains("s") || s.contains("S")))
				.collect(Collectors.groupingBy(s -> (s.contains("s") || s.contains("S")), Collectors.counting())));

		System.out.println(getList.stream().flatMapToInt(String::chars).filter(s -> s == 's').count());

	}

	private static List<String> getStrings() {
		return new ArrayList<>(Arrays.asList("Sailesh", "Kollurus", "Venkata", "Svs", "Bharat"));
	}

}
