package lesson;

import java.util.Scanner;

public class switch_case {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng        |");
		System.out.println("| 2. Trừ            |");
		System.out.println("| 3. Kết thúc    |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là : ");
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			System.out.println("PHÉP CỘNG");
			System.out.println("Nhập giá trị a: ");
			int a = scanner.nextInt();
			System.out.println("Nhập giá trị b: ");
			int b = scanner.nextInt();
			int c = a + b;
			System.out.println("Kết quả= " + c);
			break;
		case 2:
			System.out.println("PHÉP TRỪ");
			System.out.println("Nhập giá trị a: ");
			int soA = scanner.nextInt();
			System.out.println("Nhập giá trị b: ");
			int soB = scanner.nextInt();
			int soC = soA - soB;
			System.out.println("Kết quả= " + soC);
			break;
		case 3:
			System.out.println("Đã thoát chương trình");
			System.exit(0);
			break;
		default:
			System.exit(0);
		}
		scanner.close();
	}
}
//		System.out.printf("Nhập số bất kì (1->10: ");
//		int day = scanner.nextInt();
//		switch (day) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Valid number!!");
//		}
