package lesson;

import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhap so luong gia tri cua day so: ");
//		int a = scanner.nextInt();
//		for (int i = 0; i <= a; i++) {
//			System.out.println(i);
//		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("So chan: " + i);
				continue;
			} else {
				System.out.println("So le: " + i);
			}
		}
		scanner.close();
	}
}