package exercise;

import java.util.Scanner;

public class Ex_dieu_kien_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số tiền điện: ");
		int soDien = scanner.nextInt();
		if (soDien > 0 && soDien <= 100) {
			int tienDien = soDien * 1000;
			System.out.println("Số tiền bạn phải trả (<100)  là: " + tienDien);
		} else {
			int tienDien2 = 100 * 1000 + (soDien - 100) * 1500;
			System.out.println("Số tiền bạn phải trả (>100)  là: " + tienDien2);
		}
		scanner.close();
	}
}
