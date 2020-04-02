package baitap;
import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while (i<i+1)
		{
			int day =0;
			do
			{			
		System.out.print("Nhap vao so ngay: ");
		day = scan.nextInt();
			}
			while (day<1);
				
		int year = day/365;
		
		int week = (day % 365)/7;
		
		int date = day - (year*365) - (week*7);
		System.out.println("Ta duoc:");
		System.out.println(year + " Nam");
		System.out.println(week + " Tuan");
		System.out.println(date + " Ngay");
		System.out.println();
		
		}
	}
}
