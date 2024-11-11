package diachi;
import java.util.Scanner;
public class Test {
	 public static void main(String[] args) {
		        DiaChi diaChi = new DiaChi("Thôn A", "Xã B", "Huyện C", "Tỉnh D");
		        System.out.println(diaChi.getthon()); 
		        diaChi.setthon("Thôn X");
		        System.out.println(diaChi.getthon()); 
		        System.out.println(diaChi);
		    }
		

	}
	

