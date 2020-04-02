package baitap;
import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
	
		System.out.println("CHUONG TRINH KIEM TRA KI TU ");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap vao ki tu can kiem tra: ");
		
		
		//kiểu dữ liệu char
		char kitu = scan.next () . charAt(0);
		
		//xét điều kiện
		if (
				(kitu >= 'a' && kitu <= 'z') 
				||
				(kitu >= 'A' && kitu <= 'Z'))
			
			
		{
			System.out.println("Ki tu ban nhap vao la chu cai.");
		}
		else
			System.out.println("Ki tu ban nhap vao la so: ");
		
			
	}

}
