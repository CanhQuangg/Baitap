package baitap;
import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Kiem tra nam nhuan");
		int i = 0;
		while (i<i+1)
		{

		int nam = 0;
		do {
			System.out.print("Nhap nam muon kiem tra: ");
			nam = scan.nextInt();
		} while (nam < 1);

		if (nam % 4 == 0) {
			System.out.print("Nam " + nam);
			System.out.println(" la nam nhuan");
		}
		else
		{
		System.out.print("Nam " + nam);
		System.out.println(" khong phai la nam nhuan");
	}
	}
}
}
