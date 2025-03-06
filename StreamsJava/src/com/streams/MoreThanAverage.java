package com.streams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.streams.Data.Employee;
import com.streams.Data.EmployeeHardCodeData;

public class MoreThanAverage {

	public static void main(String[] args) {
		List<Employee> list = EmployeeHardCodeData.getEmployeeDetails();

		OptionalDouble avg = list.stream().mapToDouble(s -> s.getSalary()).average();
//		double averageSal = avg.orElse(0.0);
//		if (avg.isPresent())
//			averageSal = avg.getAsDouble();
		System.out.println("Average salary value is: " + avg);
		List<Employee> moreThanAvg = list.stream().filter(s -> (double) s.getSalary() > avg.orElse(0.0))
				.collect(Collectors.toList());

		System.out.println(moreThanAvg);

	}

}
