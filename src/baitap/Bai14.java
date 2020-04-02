package baitap;

import java.util.Scanner;

public class Bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String chuoi;
		char dau,cuoi;
		
		System.out.print("Vui long nhap so: ");
		chuoi = scan.nextLine();
		
		int a = chuoi.length ();
		dau = chuoi.charAt(0);
		cuoi = chuoi.charAt(a-1);
		
		System.out.println("So dau tien la: "+dau);
		System.out.println("So cuoi cung la: "+cuoi);
	

		
		
		
		
	}

}
