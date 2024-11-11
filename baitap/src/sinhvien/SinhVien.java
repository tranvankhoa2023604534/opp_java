package sinhvien;

public class SinhVien extends Nguoi{
	private String lop;
    private String nganh;
    private Truong truong;
    
    public SinhVien(String ten, int tuoi, char gioiTinh) {
		super(ten, tuoi, gioiTinh);
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }
	public String getlop() {
		return lop;
	}
	public void setlop(String lop) {
		this.lop=lop;
	}
	public String getnganh() {
		return nganh;
	}
	public void setnganh(String nganh) {
		this.nganh=nganh;
	}
	public Truong gettruong() {
		return truong;
	}
	public void settruong(Truong truong) {
		this.truong=truong;
	}
    
    
    public String toString() {
        return "SinhVien{" +
                super.toString() +
                ", lop='" + lop + '\'' +
                ", nganh='" + nganh + '\'' +
                ", truong=" + truong +
                '}';
    }

}
