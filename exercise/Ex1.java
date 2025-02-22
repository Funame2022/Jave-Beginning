package exercise;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập điểm môn A: ");
		int A = scanner.nextInt();
		System.out.println("Nhập điểm môn B: ");
		int B = scanner.nextInt();
		System.out.println("Nhập điểm môn C: ");
		int C = scanner.nextInt();
		int mark = (A + B + C) / 3;
		System.out.printf("Name: " + name + "  " + "Average mark: " + mark);
		scanner.close();
	}
}
