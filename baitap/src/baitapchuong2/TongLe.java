package baitapchuong2;
import java.util.Scanner;
public class TongLe {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tam=0;
		for(int i=0;i<100;i++)
		{
			if(i%2!=0)
			{
				tam+=i;
			}
			
		}
		System.out.println("tong cac so le la: "+tam);
	}

}
