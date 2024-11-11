package baitapchuong2;
import java.util.Scanner;
public class XepLoaiSV {
	private double diemThi;
	
	public XepLoaiSV(double diemThi)
	{
		this.diemThi=diemThi;
	}
	public String getXepLoai()
	{
		if(diemThi>=90)
			
		{
			return"A";
		}
		else if(diemThi>=80)
		{
			return "B";
		}
		else if(diemThi>=70)
		{
			return"C";
		}
		else if(diemThi>=50)
		{
			return "D";
		}
		else return"F";
		
	}
	public static void main(String[] args )
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap diem thi cua SV: ");
		double diemThi=scanner.nextDouble();
		XepLoaiSV b12 = new XepLoaiSV(diemThi);
		String xepLoai=b12.getXepLoai();
		System.out.println("xep loai cua sv la: "+xepLoai);
	}
	

}
