package baitapchuong2;
import java.util.Scanner;
public class Nhapvao {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("nhap vao mot so nguyen a:");
		int a=scanner.nextInt();
		System.out.println("nhap mot so thuc b: ");
		int b=scanner.nextInt();
		System.out.print("nhap vao mot ky tu");
		char kyTu=scanner.next().charAt(0);
		System.out.println("ky tu ban vua nhao la : "+kyTu);
		
		System.out.print("nhap vao mot chuoi ky tu ");
		String chuoi=scanner.nextLine();
		System.out.println("chuoi ban vua nhap la : "+chuoi);
		int d=a+b;
		System.out.println("tong 2 so la : "+d);
		int hieu=a-b;
		System.out.println("hieu 2 so la: "+hieu);
		int tich=a*b;
		System.out.println("tich 2 so la :"+tich);
		int thuong=a/b;
		System.out.println("thuong 2 so la:"+thuong);

	}
}
