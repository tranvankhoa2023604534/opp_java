package baitapchuong2;
import java.util.Scanner;
public class KhachHangNhaNghi {
	private int soNgayLuuTru;
	public KhachHangNhaNghi(int soNgayLuuTru)
	{
		this.soNgayLuuTru=soNgayLuuTru;
	}
	public double tinhTienPhong() {
		
		double donGia=0;
		double t=200_000;
		if(soNgayLuuTru==1)
		{
			donGia=0;
		}
		else if(soNgayLuuTru>=2&&soNgayLuuTru<=4)
		{
			donGia= t-t*(20/100);
		}
		else if(soNgayLuuTru>=5&&soNgayLuuTru<=10)
		{
			donGia= t-t*(40/100);
		}
		else {
			donGia=t-t*( 60/100);
		}
		return donGia*soNgayLuuTru;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap so ngay luu tru: ");
		int soNgayLuuTru=scanner.nextInt();
		KhachHangNhaNghi khachhang=new KhachHangNhaNghi(soNgayLuuTru);
		double tienPhong=khachhang.tinhTienPhong();
		System.out.println("So tien phai thanh toan: "+tienPhong);
	}
}
