package sinhvien;

public class Truong {
	private String ten;
    private String diaChi;
    private String hieuTruong;

    public Truong(String ten,String diaChi,String hieuTruong) {
    	this.ten=ten;
    	this.diaChi=diaChi;
    	this.hieuTruong=hieuTruong;
    }
    public String getten() {
    	return ten;
    }
    public void setten(String ten) {
    	this.ten=ten;
    }
    public String getdiaChi() {
    	return diaChi;
    }
    public void setdiaChi(String diaChi) {
    	this.diaChi=diaChi;
    }
    public String gethieuTruong() {
    	return hieuTruong;
    }
    public void sethieuTruong(String hieuTruong) {
    	this.hieuTruong=hieuTruong;
    }
    public String toString() {
    	return " "+ten+", dia chi: "+diaChi+", hieu truong: "+hieuTruong;
    }

}
