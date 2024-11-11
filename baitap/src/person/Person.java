package person;

public class Person {
	private String name;
    private String dob;
    private String pob;
    private char gender;
    private String email;
    private String phone;

    public Person(String name, String dob, String pob, char gender, String email, String phone) {
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getdob() {
    	return dob;
    }
    public void setdob(String dob) {
    	this.dob=dob;
    }
    public String getpob() {
    	return pob;
    }
    public void setpob(String pob) {
    	this.pob=pob;
    }
    public char getgender() {
    	return gender;
    }
    public void setgender(char gender) {
    	this.gender=gender;
    }
    public String getemail() {
    	return email;
    }
    public void setemail(String email) {
    	this.email=email;
    }
    public String getphone() {
    	return phone;
    }
    public void setphone(String phone) {
    	this.phone=phone;
    }
    public String toString() {
        return "Person{" +"name=" + name +
        		", dob=" + dob +  
        		", pob=" + pob + 
        		", gender=" + gender +
        		", email=" + email +  
                ", phone=" + phone + 
                '}';
    }
}

