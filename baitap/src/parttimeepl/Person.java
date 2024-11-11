package parttimeepl;

public class Person {
	private String name;
    private int age;
    private char gender;
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getage() {
    	return age;
    }
    public void setage(int age) {
    	this.age=age;
    }
    public char gender() {
    	return gender;
    }
    public void setgender(char gender) {
    	this.gender=gender;
    }
   
    
    public String toString() {
        return "name='" + name +", age=" + age +", gender=" + gender ;
    }

}
