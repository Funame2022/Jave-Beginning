package exercise;

import java.util.Scanner;

public class Ex_Arrays_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 1 so nguyen: ");
		int a = sc.nextInt();
		sc.close();

		int count = 0;
		System.out.println("Uoc so khac: ");
		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0) {
				count++;

				System.out.print("  " + i);
				continue;
			}
		}
		System.out.println("\n");
//		for (int i = 2; i <= a - 1; i++) {
//			if (a % i == 0) {
//				System.out.println(i);
//			}
//		}

		if (count == 0) {
			System.out.printf("%d la SO NGUYEN TO", a);
		} else {
			System.out.printf("%d KHONG PHAI SO NGUYEN TO", a);
		}
		sc.close();
	}
}
