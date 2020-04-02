package baitap;

import java.util.Scanner;

public class Bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("CHƯƠNG TRÌNH ĐẾM CÁC SỐ NGUYÊN");
		
		//khai báo biến
		int so = 0;
		
		System.out.print("Nhap so: ");
		int x = scan.nextInt();
		
		while (x % 10 > 0)
		{
			so++;
			x = x/10;
		}
		
		System.out.println("So da nhap co: "+so+" chu so.");

	}

}
