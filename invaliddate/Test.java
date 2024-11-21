package invaliddate;

public class Test {
	public static void main(String[] args) {
        try {
            ThoiGian tg1 = new ThoiGian(29, 2, 2024); 
            tg1.hienThi();

            ThoiGian tg2 = new ThoiGian(31, 4, 2023);
            tg2.hienThi();
        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        try {
            ThoiGian tg3 = new ThoiGian(15, 13, 2022);
            tg3.hienThi();
        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

}
