package com.streams;

import java.util.List;
import java.util.Optional;

import com.streams.Data.Employee;
import com.streams.Data.EmployeeHardCodeData;

public class StreamsBasicsInJava {
	public static void main(String[] args) {

		List<Employee> listOfEmp = EmployeeHardCodeData.getEmployeeDetails();
		getMaxAge(listOfEmp);
		listOfEmp.stream().min(((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())));

	}

	private static void getMaxAge(List<Employee> listOfEmp) {
		Optional<Integer> maxAge = listOfEmp.stream().max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
//				.map(Employee::getAge);
				.map(e -> {
					System.out.println("Name: " + e.getName() + " Age: " + e.getAge());
					return e.getAge();
				});

		System.out.println(maxAge.get());
	}
}
