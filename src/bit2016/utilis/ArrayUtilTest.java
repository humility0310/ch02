package bit2016.utilis;

public class ArrayUtilTest {

	public static void main(String[] args) {
		// int 배열을 double 배열로 변환
		int[] arrayInt = { 10, 20, 30, 40, 50 };
		int[] arrayInt2 = null;
		int[] arrayInt3 = null;
		int[] arrayInt4 = { 1, 2, 3, 4, 5 };
		double[] arrayDouble = ArrayUtil.intToDouble(arrayInt);
		for (int i = 0; i < arrayDouble.length; i++) {
			System.out.print(arrayDouble[i] + " ");
		}
		System.out.println("");

		// double 배열을 int 배열로 변환
		arrayInt2 = ArrayUtil.doubleToInt(arrayDouble);
		for (int i = 0; i < arrayDouble.length; i++) {
			System.out.print(arrayInt2[i] + " ");
		}
		System.out.println("");

		// int 배열 두개를 연결한 새로운 배열 리턴
		arrayInt3 = ArrayUtil.concat(arrayInt, arrayInt4);
		for (int i = 0; i < arrayInt3.length; i++) {
			System.out.print(arrayInt3[i] + " ");
		}
	}

}
