package congnhan;
import java.util.Scanner;
public class CongNhanTCN extends CongNhan{
	private double luongCoBan;
    private double heSoLuong;
    private int soNgayCong;

    public CongNhanTCN() {
        loaiCongNhan = "CNTCN";
    }
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = scanner.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = scanner.nextDouble();
        System.out.print("Nhập số ngày công: ");
        soNgayCong = scanner.nextInt();
    }
    public double tinhLuong() {
        double thuong = 0;
        if (soNgayCong >= 20) {
            thuong = 1.2 * luongCoBan;
        }
        return luongCoBan * heSoLuong + thuong;
    }

}
