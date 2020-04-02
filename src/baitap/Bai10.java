package baitap;
import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Xac dinh so chan le");
		
		System.out.print ("Nhap so can xac dinh: ");
		
		//số cần xác định là biến a
		int a = scan.nextInt();
		
		
		if (a % 2 == 0)
		{
			System.out.println(a +" la so chan");
			
		}
		else 
			System.out.println(a + " la so le");
	
	}

}
