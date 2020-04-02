package baitap;
import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		int i=0;
		while (i<i+1)
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("So lon nhat giua ba so");
			
			System.out.print("Nhap so thu nhat: ");
			int a = scan.nextInt();
			
			System.out.print("Nhap so thu hai: ");
			int b = scan.nextInt();
			
			System.out.print("Nhatp so thu ba: ");
			int c = scan.nextInt();
			
			int max1 = Math.max(a, b);
			
			int max = Math.max(max1, c);
			
			
			
			System.out.println("So lon nhat la: " + max);
			System.out.println();
			
		
	}
	}
}
