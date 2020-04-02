package baitap;

import java.util.Scanner;

public class Bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("CHƯƠNG TRÌNH TÍNH TÍCH CÁC SỐ");
		System.out.print("Nhap so: ");
		// x là số nhập vào
		int x = scan.nextInt();
		
		//khai báo các biến cần dùng
			//chữ số
			int chuso;
			//tích các số
			int tich = 1;
			
		//thực hiện phép tính
			while (x>0)
			{
				chuso = x % 10;
				if (chuso != 0)
				{
				tich *= chuso;
				x = x/10;
				}
				else tich = tich *x;
			}
			
		//xuất ra màn hình kết quả
			System.out.println("Tich cac chu so la: " +tich);
			
			
	}

}
