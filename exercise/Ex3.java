package exercise;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh hình vuông: ");
		int canh = scanner.nextInt();
		double thetich = Math.pow(canh, 3);
		System.out.println("Thể tích hình vuông: " + thetich);
		scanner.close();
	}
}
