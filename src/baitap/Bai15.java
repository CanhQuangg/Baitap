package baitap;

import java.util.Scanner;

public class Bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CHƯƠNG TRÌNH TÍNH TỔNG CÁC SỐ");
		System.out.print("Nhap so: ");
		// x là số nhập vào
		int x = scan.nextInt();
		
		//khai báo các biến cần dùng
			//chữ số
			int chuso;
			//tổng các số
			int tong = 0;
			
		//thực hiện phép tính
			while (x>0)
			{
				chuso = x % 10;
				tong += chuso;
				x = x/10;
			}
			
		//xuất ra màn hình kết quả
			System.out.println("Tong cac chu so la: " +tong);
			
	}

}
