package congnhan;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		     // Tạo đối tượng công nhân khoán sản phẩm
	    CongNhanKSP cnksp = new CongNhanKSP();
		System.out.println("Nhập thông tin cho công nhân khoán sản phẩm:");
		cnksp.nhapThongTin();
		        // Tạo đối tượng công nhân tính công nhật
		CongNhanTCN cntcn = new CongNhanTCN();
		System.out.println("\nNhập thông tin cho công nhân tính công nhật:");
		cntcn.nhapThongTin();
		        // In thông tin công nhân
		System.out.println("\nThông tin công nhân khoán sản phẩm:");
		cnksp.inThongTin();
		System.out.println("\nThông tin công nhân tính công nhật:");
		cntcn.inThongTin();
	}		       
}
