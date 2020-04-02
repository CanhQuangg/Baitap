package baitap;

import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("CHUONG TRINH KIEM TRA HINH TAM GIAC");
		
		System.out.println("Vui long nhap vao gia tri cua cac goc:");
		
		int goc1;
		int goc2;
		int goc3; 
	
		//nhập góc thứ nhất
	do	
	{
		System.out.print("Goc thu nhat: ");	
		goc1 = scan.nextInt();
	}
	while (goc1 <= 0);
	
	
	
	//nhập góc thứ 2
	do
	{
		System.out.print("Goc thu hai: ");
		goc2 = scan.nextInt();
	}
	while (goc2<=0);
	
	//nhập góc thứ 3
	do
	{
		System.out.print("Goc thu ba: ");
		goc3 = scan.nextInt();
	}
	while (goc3<=0);
	
	if (goc1 + goc2 + goc3 == 180)
	{
		System.out.println("Đây là hình tam giác");
	}
	else
		System.out.println("Day khong phai la hinh tam giac.");
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
}