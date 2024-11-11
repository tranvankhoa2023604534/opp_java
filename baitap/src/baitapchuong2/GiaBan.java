package baitapchuong2;
import java.util.Scanner;
public class GiaBan {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
	System.out.println("Nhap vao gia ban: ");
	double a=scanner.nextDouble();
	System.out.println("Nhap vao phan tram giam gia: ");
	double b =scanner.nextDouble();
	double gia;
	gia=a-a*(b/100);
	System.out.println("gia sau khi giam gia la: "+gia);

	}
	
}
