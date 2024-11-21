package luongnguoild;
import java.util.Scanner;

public class KiSu extends NguoiLaoDong{
	private double luongCoBan;
    private double heSoLuong;
    private int soNgayCong;

    public KiSu() {
        this.loaiLaoDong = "Kỹ sư";
    }

    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = scanner.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = scanner.nextDouble();
        System.out.print("Nhập số ngày công: ");
        soNgayCong = scanner.nextInt();
    }

    public double tinhLuong() {
        double thuong;
        if (soNgayCong >= 25) {
            thuong = 2000000;
        } else if (soNgayCong > 15) {
            thuong = 1000000;
        } else {
            thuong = 500000;
        }
        return luongCoBan * heSoLuong + thuong;
    }

}
