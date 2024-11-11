package parttimeepl;

class Employee extends Person {
    private String employerName;
    private String employeeId;
    private double salary;

    public Employee(String name, int age, char gender, String employerName, String employeeId, double salary) {
        super(name, age, gender);
        this.employerName = employerName;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public String getemployerName() {
    	return employerName;
    }
    public void setemployerName(String employerName) {
    	this.employerName=employerName;
    }
    public String getemployeeId() {
    	return employeeId;
    }
    public void setemployeeId(String employeeId) {
    	this.employeeId=employeeId;
    }
    public double getsalary() {
    	return salary;
    }
    public void setsalary(double salary) {
    	this.salary=salary;
    }
    public String toString() {
        return super.toString() +", employerName=" + employerName + ", employeeId=" + employeeId +", salary=" + salary ;
    }

}
