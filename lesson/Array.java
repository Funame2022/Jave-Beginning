package lesson;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] number = { 6, 4, 7, 10, 5, 2, 1, 3, 9, 8 };

		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println("Day so la: " + Arrays.toString(number));
	}
}
