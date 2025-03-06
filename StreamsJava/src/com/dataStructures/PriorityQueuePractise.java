package com.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import com.streams.Data.Employee;
import com.streams.Data.EmployeeHardCodeData;

public class PriorityQueuePractise {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(2);
		pq.offer(12);
		pq.offer(2);
		pq.offer(11);
		pq.offer(4);
		pq.offer(1);
		pq.offer(3);
		pq.offer(122);
		pq.offer(5);
		pq.offer(102);
		System.out.println(pq);

		PriorityQueue<int[]> pq1 = new PriorityQueue<>((a, b) -> a[0] - b[0]);
		pq1.offer(new int[] { 3, 4 });
		pq1.offer(new int[] { 2, 3 });
		pq1.offer(new int[] { 1, 2 });
		pq1.offer(new int[] { 10, 12 });
		pq1.offer(new int[] { 11, 22 });
		while (!pq1.isEmpty()) {
			int temp[] = pq1.poll();
			for (int i = 0; i < temp.length; i++)
				System.out.print(temp[i] + " ");
			System.out.println();
		}
		System.out.println("\n\n");

		PriorityQueue<Employee> pqEmp = new PriorityQueue<>((a, b) -> Integer.compare(a.getAge(), b.getAge()));
		/**
		 * PriorityQueue<Employee> pqEmp = new PriorityQueue<>((a, b) -> a.getAge() -
		 * b.getAge());
		 **/
		pqEmp.addAll(EmployeeHardCodeData.getEmployeeDetails());

		System.out.println(pqEmp);

		pqEmp = new PriorityQueue<>((a, b) -> a.getId() - b.getId());

		pqEmp.addAll(EmployeeHardCodeData.getEmployeeDetails());

		System.out.println("\n\n With Ids: " + pqEmp);

		pqEmp = new PriorityQueue<>((a, b) -> a.getName().compareTo(b.getName()));

		pqEmp.addAll(EmployeeHardCodeData.getEmployeeDetails());

		System.out.println("\n\n With names: " + pqEmp);

	}

}
