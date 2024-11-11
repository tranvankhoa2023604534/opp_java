package benhnhan;

public class Test {
	 public static void main(String[] args) {
		 BenhVien benhvien = new BenhVien("Bệnh viện X", "Hà Nội", "Giám đốc A");
	     Nguoi ng=new Nguoi("Nguyen van an",29,'m');
	     BenhNhan bn=new BenhNhan( "Nguyen Van a",29,'M',"tien su benh tim","chuan doan a",benhvien);
	     System.out.println(bn);
	    }
}
