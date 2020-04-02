package baitap;
import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tinh gia tri tuyet doi");
		System.out.print("Nhap so can tinh gia tri tuyet doi: ");
		
		int a = scan.nextInt();
		
		int x=Math.abs(a);
		
		System.out.println("Gia tri tuyet doi cua " + a +" la: " + x);
		
		
	}

}
