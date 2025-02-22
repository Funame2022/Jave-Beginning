package lesson;

import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập lương của bạn:");
		int cash = scanner.nextInt();
		if (cash < 10000000) {
			System.out.println("Không đóng thuế");
		} else if (10000000 < cash && cash <= 15000000) {
			System.out.println("Đóng thuế 10%");
		} else if (cash > 15000000 && cash <= 30000000) {
			System.out.println("Đóng thuế 20%");
		} else if (cash > 30000000) {
			System.out.println("Đóng thuế 50%");
		}
		scanner.close();
	}
}
