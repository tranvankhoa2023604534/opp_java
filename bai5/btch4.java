package bai5;
import java.util.Scanner;
public class btch4 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            try {
	                System.out.print("Nhập lương của bạn (hoặc nhập 0 để thoát): ");
	                double luong = scanner.nextDouble();
	                if (luong == 0) {
	                    System.out.println("Kết thúc chương trình.");
	                    break;
	                }
	                if (luong < 5000000 || luong > 20000000) {
	                    throw new OutOfRangeException("Lương nằm ngoài phạm vi cho phép (5.000.000 - 20.000.000): " + luong);
	                }
	                System.out.println("Lương hợp lệ: " + luong);

	            } catch (OutOfRangeException e) {
	                System.out.println("Lỗi: " + e.getMessage());
	            } catch (Exception e) {
	                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
	                scanner.nextLine();
	            }
	        }
	        scanner.close();
	    }

}
