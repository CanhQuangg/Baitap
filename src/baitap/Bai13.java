package baitap;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);

		float ly = 0, hoa = 0, sinh = 0, toan = 0, tin = 0;
		int i = 0;
		System.out.println("CHUONG TRINH XEP LOAI");
		while (i<i+1)
		{
		
		System.out.println("Vui long nhap diem");
		
		//Môn vật lý
		do 	
		{
			if (ly<0 || ly>10)
			{
				System.out.println("Vui long nhap diem tu 0 den 10.");
			}
			
			System.out.print("Vat Ly: ");
			ly = scan.nextFloat();				
		}
		while (ly<0 || ly>10);

		
		
		
		//Môn hóa học
		do
		{
			if (hoa<0 || hoa>10)
			{
				System.out.println("Vui long nhap diem tu 0 den 10.");
			}
			System.out.print("Hoa Hoc: ");
			hoa = scan.nextFloat();
			
		}
		while (hoa<0 || hoa>10);
		
		
		//Môn sinh học
		do
		{
			if (sinh<0 || sinh>10)
			{
				System.out.println("Vui long nhap diem tu 0 den 10.");
			}
			System.out.print("Sinh Hoc: ");
			sinh = scan.nextFloat();
			
		}
		while (sinh<0 || sinh>10);

		//Môn toán
		do
		{
			if (toan<0 || toan>10)
			{
				System.out.println("Vui long nhap diem tu 0 den 10.");
			}
			System.out.print("Toan: ");
			toan = scan.nextFloat();
			
		}
		while (toan<0 || toan>10);
		
		//Môn tin học
		do
		{
			if (tin<0 || tin>10)
			{
				System.out.println("Vui long nhap diem tu 0 den 10.");
			}
			System.out.print("Tin Hoc: ");
			tin = scan.nextFloat();
			
		}
		while (tin<0 || tin>10);
		
		
		//tính tbm
		float tbm =   (ly + hoa + sinh + toan + tin)/5;
		
		System.out.println("Trung binh mon la: "+ tbm);
		
		if (tbm > 9)
		{
			System.out.println("Xep loai A");
		}
		if (tbm >8)
		{
			System.out.println("Xep loai B");
		}
		if (tbm >7)
		{
			System.out.println("Xep loai C");
		}
		if (tbm>6)
		{
			System.out.println("Xep loai D");
		}
		if (tbm>4)
		{
			System.out.println("Xep loai E");
		}
		else
		{
			System.out.println("Xep loai F");
		}
		System.out.println();
		
		}
		
		
		
	}

}
