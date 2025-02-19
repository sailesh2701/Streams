package com.streams;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import com.streams.Data.Employee;
import com.streams.Data.EmployeeHardCodeData;

public class StreamsBasicsInJava {
	public static void main(String[] args) {

		List<Employee> listOfEmp = EmployeeHardCodeData.getEmployeeDetails();
		getMaxAge(listOfEmp);
		listOfEmp.stream().min(((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())));

	}

	private static void getMaxAge(List<Employee> listOfEmp) {
		int count = 0;
		AtomicInteger c = new AtomicInteger(1); // ✅ Mutable counter
		Optional<Integer> maxAge = listOfEmp.stream()// .max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
//				.map(Employee::getAge);
				.map(e -> {
					try {
						System.out.println("Name of the " + c.getAndIncrement() + " employee is: " + e.getName()
								+ " Age: " + e.getAge());
						Thread.sleep(1000);
//						count=count+1; Cannot USe Local variable inside Streams.!!
					} catch (InterruptedException e3) {
						e3.printStackTrace();
					}
					return e.getAge();
				}).max((e1, e2) -> Integer.compare(e1, e2));

		System.out.println("\n\n\n-----------------------\nmaximumAge is " + maxAge.get());
	}
}
