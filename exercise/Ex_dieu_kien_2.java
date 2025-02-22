package exercise;

import java.util.Scanner;

public class Ex_dieu_kien_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số A: ");
		int a = scanner.nextInt();
		System.out.println("Nhập số B: ");
		int b = scanner.nextInt();
		System.out.println("Nhập số C: ");
		int c = scanner.nextInt();
		if (a == 0) {
			System.out.println("Áp dụng tính phương trình một nghiệm");
			if (b == 0 && c == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				float x = (float) -c / b;
				System.out.printf("Kết quả %dx+%d = 0", b, c);
				System.out.printf(" là %.2f", x);
			}
		} else {
			System.out.println("Áp dụng tính phương trình bậc 2");
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương trình nghiệm kép %.3f", x);
			} else {
				System.out.println("Phương trình có 2 nghiệm phân biệt");
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Giá trị x1: %.2f \n", x1);
				System.out.printf("Giá trị x2: %.2f", x2);
			}
		}
		scanner.close();
	}
}
