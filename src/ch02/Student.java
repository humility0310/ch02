package ch02;

public class Student extends Person {
	public Student() {
		age = 40; // 보무의 디폴트 접근자는 접근가능(같은 패키지에서만)
		name = "김영조";// protected는 자식에서 접근가능(다른 패키지에서도 가능)
		//height=172;//private는 접근불가
		weight = 76;//public는 접근가능
	}
}
