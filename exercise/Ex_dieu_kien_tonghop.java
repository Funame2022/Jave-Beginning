package exercise;

import java.util.Scanner;

public class Ex_dieu_kien_tonghop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LUA CHON TINH NANG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("||     1. Giai phuong trinh bac nhat         ||");
		System.out.println("||     2. Giai phuong trinh bac hai          ||");
		System.out.println("||     3. Tinh so tien dien                  ||");
		System.out.println("||     4. Ket thuc                           ||");
		System.out.println("++ ----------------------------------------- ++");
		System.out.print("Lua chon cua ban la: ");
		int choose = scanner.nextInt();
		switch (choose) {

		case 1:
			System.out.println(">> GIAI PHUONG TRINH BAC NHAT<<");
			System.out.printf("Nhap so a: ");
			int soA = scanner.nextInt();
			System.out.printf("Nhap so b: ");
			int soB = scanner.nextInt();
			if (soA == 0 && soB == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else if (soA == 0 && soB != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				float x = (float) -soB / soA;
				System.out.printf("Kết quả %dx+%d = 0", soA, soB);
				System.out.printf(" là %.2f", x);
			}
			break;

		case 2:
			System.out.println(">> GIAI PHUONG TRINH BAC HAI<<");
			System.out.println("Nhập số A: ");
			int a = scanner.nextInt();
			System.out.println("Nhập số B: ");
			int b = scanner.nextInt();
			System.out.println("Nhập số C: ");
			int c = scanner.nextInt();
			if (a == 0) {
				System.out.println("Ap dung tinh phuong trinh bac nhat");
				if (b == 0 && c == 0) {
					System.out.println("Phuong trinh vo so nghiem");
				} else if (b == 0 && c != 0) {
					System.out.println("Phuong trinh vo nghiem");
				} else {
					float x = (float) -c / b;
					System.out.printf("Ket qua %dx+%d = 0", b, c);
					System.out.printf(" la %.2f", x);
				}
			} else {
				System.out.println("Ap dung tinh phuon trinh bac hai");
				int delta = b * b - 4 * a * c;
				if (delta < 0) {
					System.out.println("Phuong trinh vo nghiem");
				} else if (delta == 0) {
					float x = (float) -b / (2 * a);
					System.out.printf("Phuong trinh co nghiem kep %.3f", x);
				} else {
					System.out.println("Phuong trinh co 2 nghiem phan biet:");
					double x1 = (-b + Math.sqrt(delta)) / (2 * a);
					double x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.printf("Gia tri x1: %.2f \n", x1);
					System.out.printf("Gia tri x2: %.2f", x2);
				}
			}
			break;

		case 3:
			System.out.println("TINH TIEN DIEN THEO HAN MUC");
			System.out.println("Nhap so tien dien: ");
			int soDien = scanner.nextInt();
			if (soDien > 0 && soDien <= 100) {
				int tienDien = soDien * 1000;
				System.out.println("So tien ban phai tra (<100)  la: " + tienDien + " VND");
			} else {
				int tienDien2 = 100 * 1000 + (soDien - 100) * 1500;
				System.out.println("So tien ban phai tra (>100)  la: " + tienDien2 + " VND");
			}
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Loi!! Khoi dong lai chuong trinh!");
			System.exit(0);
		}
		scanner.close();
	}
}
