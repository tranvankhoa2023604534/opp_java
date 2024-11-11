package nhanvien;

public class DiaChi {
	private String thon;
	private String xa;
	private String huyen;
	private String tinh;
	
	public DiaChi(String thon, String xa, String huyen, String tinh) {
		this.thon=thon;
		this.xa=xa;
		this.huyen=huyen;
		this.tinh=tinh;
	}
	public String getthon() {
		return thon;
	}
	public void setthon(String thon) {
		this.thon=thon;
	}
	public String getxa() {
		return xa;
	}
	public void setxa(String xa) {
		this.xa=xa;
	}
	public String gethuyen() {
		return huyen;
	}
	public void sethuyen(String huyen) {
		this.huyen=huyen;
	}
	public String gettinh() {
		return tinh;
	}
	public void settinh(String tinh) {
		this.tinh=tinh;
	}
	public String toString() {
		return " {"+"thon:"+thon+", xa:"+xa+", huyen:"+huyen+", tinh:"+tinh+"}";
	}


}
