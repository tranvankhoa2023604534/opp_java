package sinhvien;

public class Nguoi {
	private String ten;
    private int tuoi;
    private char gioiTinh;
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public int gettuoi() {
    	return tuoi;
    }
    public void settuoi(int tuoi) {
    	this.tuoi=tuoi;
    }
    public char getgioiTinh() {
    	return gioiTinh;
    }
    public void setgioiTinh(char gioiTinh) {
    	this.gioiTinh=gioiTinh;
    }
    public String toString() {
        return"ten='" + ten + '\'' +", tuoi=" + tuoi +", gioiTinh=" + gioiTinh ;
    }

}
