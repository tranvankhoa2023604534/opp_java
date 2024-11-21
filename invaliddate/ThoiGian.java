package invaliddate;

public class ThoiGian {
	  private int ngay;
	    private int thang;
	    private int nam;
	    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
	        if (!isValidDate(ngay, thang, nam)) {
	            throw new InvalidDateException("Ngày, tháng, năm không hợp lệ: " + ngay + "/" + thang + "/" + nam);
	        }
	        this.ngay = ngay;
	        this.thang = thang;
	        this.nam = nam;
	    }
	    private boolean isValidDate(int ngay, int thang, int nam) {
	        if (nam < 0 || thang < 1 || thang > 12 || ngay < 1 || ngay > 31) {
	            return false;
	        }
	        int[] ngayTrongThang = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	        if (isLeapYear(nam)) {
	            ngayTrongThang[1] = 29; 
	        }
	        return ngay <= ngayTrongThang[thang - 1];
	    }
	    private boolean isLeapYear(int nam) {
	        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
	    }
	    public void hienThi() {
	        System.out.println("Ngày: " + ngay + "/" + thang + "/" + nam);
	    }

}
