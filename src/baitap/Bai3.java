package baitap;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tinh chu vi va dien tich hinh chu nhat");
		
		System.out.println();
		
		System.out.print("Nhap chieu dai hinh chu nhat: ");
		int dai = scan.nextInt();
		
		System.out.print
		("Nhap chieu rong hinh chu nhat: ");
		int rong = scan.nextInt();
		
		int chuvi = 2*(dai + rong);
		int dientich = dai*rong;
		
		System.out.println("Chu vi hinh chu nhat la: " + chuvi);
		System.out.println("Dien tich hinh chu nhat la: "+ dientich);
				
	}

}
