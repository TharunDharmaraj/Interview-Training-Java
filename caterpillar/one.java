package caterpillar;

import java.util.Arrays;

class one {
	void order(int arr[], int n, int k) {
		int[] b = arr;
		Arrays.sort(b);
		int j = 0;
		for (int i = k; i <= n / 2; i++) {
			int temp = b[i];
			b[i] = b[n - 1 - j];
			arr[n - 1 - j] = temp;
			j++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}

class Main {
	public static void main(String args[]) {
		int arr[] = { 1, 45, 23, 98, 66 };
		one obj = new one();
		int k = 3;
		int n = arr.length;
		obj.order(arr, n, k);
	}
}