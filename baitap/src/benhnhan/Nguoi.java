package benhnhan;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gioitinh;
	
	public Nguoi(String ten, int tuoi, char gioitinh) {
		this.ten=ten;
		this.tuoi=tuoi;
		this.gioitinh=gioitinh;
	}
	public String getten() {
		return ten;
	}
	public void setten(String ten) {
		this.ten=ten;
	}
	public int gettuoi() {
		return tuoi;
	}
	public void settuoi(int tuoi) {
		this.tuoi=tuoi;
	}
	public char getgioitinh() {
		return gioitinh;
	}
	public void setgioitinh(char gioitinh) {
		this.gioitinh=gioitinh;
	}
	public String toString() {
		return "Ten: "+ten+",tuoi: "+tuoi+", gioi tinh: "+gioitinh;
	}
}
