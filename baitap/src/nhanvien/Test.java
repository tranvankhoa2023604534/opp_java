package nhanvien;

public class Test {
	public static void main(String[] args) {
        DiaChi diachi = new DiaChi("Thôn A", "Xã B", "Huyện C", "Tỉnh D");
        NhanVien nhanvien = new NhanVien("Nguyen Van A", diachi, "01/01/2000", 'M');
        System.out.println(nhanvien.getName()); 
        System.out.println(nhanvien.getAddress()); 
        System.out.println(nhanvien); 
    }
}
