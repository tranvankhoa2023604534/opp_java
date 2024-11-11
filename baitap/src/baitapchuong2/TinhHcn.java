package baitapchuong2;
import java.util.Scanner;
public class TinhHcn {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
	System.out.println("Nhap vao canh dai a: ");
	int a =scanner.nextInt();
	System.out.println("Nhap vao canh ngan b: ");
	int b=scanner.nextInt();
	int s,d;
	s=a*b;
	d=2*(a+b);
	System.out.println("dien tich hcn la: "+s);
	System.out.println("chu vi hcn la: "+d);
	
	}
	
	

}
