package baitap;
import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		
		
		System.out.println("So lon nhat giua hai so");
		
		System.out.print("Nhap so thu nhat: ");
		int a = scan.nextInt();
		
		System.out.print("Nhap so thu hai: ");
		int b = scan.nextInt();
		
		int max = Math.max(a, b);
		
		
		System.out.println("So lon nhat la: "+ max);
		i++;
		
	
	}
}
