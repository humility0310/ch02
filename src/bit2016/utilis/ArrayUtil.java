package bit2016.utilis;

public class ArrayUtil {
	static double[] intToDouble(int[] a) {
		if (a == null) {
			return null;
		}

		int length = a.length;
		double[] result = new double[length];

		for (int i = 0; i < length; i++) {
			result[i] = a[i];
		}
		return result;
	}

	static int[] doubleToInt(double[] a) {
		if (a == null) {
			return null;
		}
		int length = a.length;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			result[i] = (int) a[i];
		}
		return result;
	}

	static int[] concat(int[] a1, int[] a2) {
		if (a1 == null || a2 == null) {
			return null;
		}
		
		int length = a1.length + a2.length;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			if (i < a1.length) {
				result[i] = a1[i];
			} else {
				result[i] = a2[i - a1.length];
			}
		}
		return result;
	}
}