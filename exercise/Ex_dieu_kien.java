package exercise;

import java.util.Scanner;

public class Ex_dieu_kien {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số a: ");
		int a = scanner.nextInt();
		System.out.printf("Nhập số b: ");
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Kết quả %dx+%d = 0", a, b);
			System.out.printf(" là %.2f", x);
		}
		scanner.close();
	}
}
