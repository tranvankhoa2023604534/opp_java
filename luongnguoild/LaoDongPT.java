package luongnguoild;
import java.util.Scanner;
public class LaoDongPT extends NguoiLaoDong {
	private int soNgayCong;
    private double donGiaNgayCong;

    public LaoDongPT() {
        this.loaiLaoDong = "Lao động phổ thông";
    }
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhập số ngày công: ");
        soNgayCong = scanner.nextInt();
        System.out.print("Nhập đơn giá ngày công: ");
        donGiaNgayCong = scanner.nextDouble();
    }
    public double tinhLuong() {
        double thuong;
        if (soNgayCong >= 25) {
            thuong = 1000000;
        } else if (soNgayCong > 15) {
            thuong = 700000;
        } else {
            thuong = 0;
        }
        return soNgayCong * donGiaNgayCong + thuong;
    }

}
