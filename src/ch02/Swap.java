package ch02;

public class Swap {

	public static void main(String[] args) {
		int i = 100;
		int j = 200;
		System.out.println("(before) i = " + i + ", j = " + j);
		swap(i, j);
		System.out.println("(after) i = " + i + ", j = " + j);

	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
