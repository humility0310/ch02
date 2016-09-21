package ch02;

public class StudentTest {

	public static void main(String[] args) {
		Person p = new Student();

		Person p2 = new Student(10);

		// Student s = new Student();
		// Person p3 = s; 위 두 코드를 합침
		Person p3 = new Student();

		Student s = (Student) p3;// 다운캐스팅     명시적(explicit)으로 캐스팅해야한다.
		
		Person p4 = s;//업캐스팅     암묵적(implicit)캐스팅을 안해줘도 됨
	}

}
