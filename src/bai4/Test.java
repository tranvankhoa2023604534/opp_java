package bai4;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi (dừng khi nhập 'DONE'):");

        while (true) {
            try {
                System.out.print("Nhập chuỗi: ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("DONE")) {
                    System.out.println("Kết thúc chương trình.");
                    break;
                }
                if (input.length() > 20) {
                    throw new StringTooLongException("Chuỗi vượt quá 20 ký tự: " + input);
                }
                System.out.println("Chuỗi hợp lệ: " + input);
            } catch (StringTooLongException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
