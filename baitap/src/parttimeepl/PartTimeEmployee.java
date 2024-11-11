package parttimeepl;

public class PartTimeEmployee extends Employee {
	private int hoursPerWeek;
    private double hourlyRate;
    
    public PartTimeEmployee(String name, int age, char gender, String employerName, String employeeId, double salary) {
		super(name, age, gender, employerName, employeeId, salary);
		// TODO Auto-generated constructor stub
	}
	public PartTimeEmployee(String name, int age, char gender, String employerName, String employeeId, double salary, int hoursPerWeek, double hourlyRate) {
        super(name, age, gender, employerName, employeeId, salary);
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyRate = hourlyRate;
    }
    public int gethoursPerWeek() {
    	return hoursPerWeek;
    }
    public void sethoursPerWeek(int hoursPerWeek) {
    	this.hoursPerWeek=hoursPerWeek;
    }
    public double gethourslyRate() {
    	return hourlyRate;
    }
    public void sethourlyRate(double hourlyRate) {
    	this.hourlyRate=hourlyRate;
    }
    
    public String toString() {
        return super.toString() +", hoursPerWeek=" + hoursPerWeek +", hourlyRate=" + hourlyRate ;
    }

}
