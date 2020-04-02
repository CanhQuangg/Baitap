package baitap;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	System.out.println("TOAN HOC CO BAN");
	System.out.println();
	int i = 0;
	while (i < i+1)
	{
System.out.print("Nhap so nguyen thu nhat: ");
int a = scan.nextInt();


System.out.print("Nhap so nguyen thu hai: ");
	int b = scan.nextInt();

	System.out.println("Gia tri cua so thu nhat la: " + a);

	System.out.println("Gia tri cua so thu hai la: "+b);
	
	int tong = a + b;
	int hieu = a - b;
	int tich = a*b;
	float thuong = a/b;
	int du = a%b;
	
	System.out.println("Tong cua hai so la: " + tong );
	
	System.out.println("Hieu cua hai so la: " + hieu);
	
	System.out.println("Tich cua hai so la: " + tich);
	
	System.out.println("Thuong cua hai so la: " + thuong);
	
	System.out.println("So du khi thuc hien phep chia hai so la: " + du);
	
	System.out.println();
	System.out.println();
	i++;
	
	}
	}
}
