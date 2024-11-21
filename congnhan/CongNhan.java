package congnhan;
import java.util.Scanner;

public abstract class CongNhan {
	protected String hoTen;
    protected String diaChi;
    protected String ngaySinh;
    protected String loaiCongNhan;
    // Phương thức nhập thông tin
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhập loại công nhân (CNKSP/CNTCN): ");
        loaiCongNhan = scanner.nextLine();
    }
    // Phương thức trừu tượng tính lương
    public abstract double tinhLuong();
    // Phương thức in thông tin
    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Loại công nhân: " + loaiCongNhan);
        System.out.println("Lương tháng: " + tinhLuong() + " VNĐ");
    }

}
