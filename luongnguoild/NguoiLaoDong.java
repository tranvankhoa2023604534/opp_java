package luongnguoild;
import java.util.Scanner;
public abstract class  NguoiLaoDong {
	 protected String hoTen;
	    protected String diaChi;
	    protected String loaiLaoDong;

	    public void nhapThongTin(Scanner scanner) {
	        System.out.print("Nhập họ tên: ");
	        hoTen = scanner.nextLine();
	        System.out.print("Nhập địa chỉ: ");
	        diaChi = scanner.nextLine();
	        System.out.print("Nhập loại lao động (Lao động phổ thông/Kỹ sư): ");
	        loaiLaoDong = scanner.nextLine();
	    }

	    
	    public abstract double tinhLuong();

	    
	    public void inThongTin() {
	        System.out.println("Họ tên: " + hoTen);
	        System.out.println("Địa chỉ: " + diaChi);
	        System.out.println("Loại lao động: " + loaiLaoDong);
	        System.out.println("Lương tháng: " + tinhLuong());
	    }

}
