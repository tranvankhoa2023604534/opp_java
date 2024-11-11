package benhnhan;

public class BenhVien {
	private String tenbv;
	private String diachi;
	private String giamdoc;

	public BenhVien(String tenbv,String diachi, String giamdoc) {

		this.tenbv=tenbv;
		this.diachi=diachi;
		this.giamdoc=giamdoc;
	}
	public String gettenbv() {
		return tenbv;
	}
	public void settenbv(String tenbv) {
		this.tenbv=tenbv;
	}
	public String getdiachi() {
		return diachi;
	}
	public void setdiachi(String diachi) {
		this.diachi=diachi;
	}
	public String getgiamdoc() {
		return giamdoc;
	}
	public void setgiamdoc(String giamdoc) {
		this.giamdoc=giamdoc;
	}
	public String toString() {
		return " "+tenbv+", dia chi: "+diachi+",giam doc: "+giamdoc;
	}
}
