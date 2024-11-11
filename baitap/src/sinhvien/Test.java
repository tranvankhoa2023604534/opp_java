package sinhvien;

public class Test {
	public static void main(String[] args) {
        Truong truong = new Truong("Đại học A", "Hà Nội", "Giáo sư B");
        SinhVien sinhVien = new SinhVien("Nguyen Van A", 20, 'M', "K18", "Công nghệ thông tin", truong);
        System.out.println(sinhVien);
    }

}
