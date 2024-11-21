package congnhan;
import java.util.Scanner;
public class CongNhanKSP extends CongNhan{
	private int soSanPham;
    private double donGia;

    public CongNhanKSP() {
        loaiCongNhan = "CNKSP";
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số sản phẩm: ");
        soSanPham = scanner.nextInt();
        System.out.print("Nhập đơn giá sản phẩm: ");
        donGia = scanner.nextDouble();
    }
    public double tinhLuong() {
        double thuong = 0;
        if (soSanPham >= 150) {
            thuong = 1500000;
        } else if (soSanPham >= 100) {
            thuong = 1000000;
        }
        return soSanPham * donGia + thuong;
    }

}
