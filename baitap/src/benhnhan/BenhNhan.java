package benhnhan;

public class BenhNhan extends Nguoi {
	private String tiensu;
	private String chuandoan;
	private BenhVien benhvien;
	

	public BenhNhan(String ten, int tuoi, char gioitinh) {
		super(ten, tuoi, gioitinh);
		// TODO Auto-generated constructor stub
	}
	public BenhNhan( String ten, int tuoi, char gioitinh,String tiensu, String chuandoan, BenhVien benhvien) {
		super(ten,tuoi,gioitinh);
		this.tiensu=tiensu;
		this.chuandoan=chuandoan;
		this.benhvien=benhvien;
	}
	public String gettiensu() {
		return tiensu;
	}
	public void settiensu(String tiensu) {
		this.tiensu=tiensu;
	}
	public String getchuandoan() {
		return chuandoan;
	}
	public void setchuandoan(String chuandoan) {
		this.chuandoan=chuandoan;
	}
	public BenhVien getbenhvien() {
		return benhvien;
	}
	public void setbenhvien(BenhVien benhvien) {
		this.benhvien=benhvien;
	}
	public String toString() {
		return super.toString()+",tien su: "+tiensu+",chuan doan: "+chuandoan+",benhvien: "+benhvien;
	}

}
