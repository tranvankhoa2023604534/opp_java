package luongnguoild;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        // Tạo đối tượng lao động phổ thông
	        LaoDongPT laoDongPT = new LaoDongPT();
	        System.out.println("Nhập thông tin lao động phổ thông:");
	        laoDongPT.nhapThongTin(scanner);
	        // Tạo đối tượng kỹ sư
	        scanner.nextLine(); // Xóa bộ đệm
	        KiSu kisu = new KiSu();
	        System.out.println("\nNhập thông tin kỹ sư:");
	        kisu.nhapThongTin(scanner);
	        // In thông tin
	        System.out.println("\nThông tin lao động phổ thông:");
	        laoDongPT.inThongTin();
	        System.out.println("\nThông tin kỹ sư:");
	        kisu.inThongTin();
	        scanner.close();
	}

}
