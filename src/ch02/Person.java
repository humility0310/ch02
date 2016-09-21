package ch02;

public class Person {
	public Person() {
		System.out.println("Person() called");
	}

	int age;
	protected String name;
	private int height;
	public int weight;

	public Person(int age) {
		System.out.println("Person(" + age + ") called");
	}
}
