package nhanvien;

public class NhanVien {
	private String name;
    private DiaChi address;
    private String dob;
    private char gender;

    
    public NhanVien() {
    }
    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }
    public String toString() {
        return "NhanVien{" +
                "name=" + name + ", address:" + address + ", dob=" + dob + ", gender=" + gender +
                '}';
    }

}
