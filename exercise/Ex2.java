package exercise;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		int dai = scanner.nextInt();
		System.out.println("Nhập chiều rộng: ");
		int rong = scanner.nextInt();
		if (rong > dai) {
			System.out.println("Giá trị lỗi. Vui lòng nhập lại");
		} else {
			int chuvi = (dai + rong) * 2;
			int dientich = dai * rong;
			int canhMin = Math.min(dai, rong);
			System.out.println("Chu vi hcn: " + chuvi);
			System.out.println("Diện tích hcn: " + dientich);
			System.out.println("Cạnh nhỏ nhất hcn " + canhMin);
			scanner.close();
		}
	}
}
