package com.streams.Data;

public class Employee {
	private Integer id;
	private String name;
	private Integer age;
	private Long salary;
	private Integer experience;

	public Employee(int id, String name, int age, long salary, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", experience="
				+ experience + "]\n";
	}

}
