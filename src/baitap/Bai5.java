package baitap;
import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Chuyen doi do C sang do F");
		System.out.print("Nhap do C muon chuyen doi: ");
		
		int C = scan.nextInt()
				;
		float F = (1.8f*C + 32);
		
		System.out.print (C + " do C = ");
		
		System.out.println(F+ " do F");
		
		

	}

}
