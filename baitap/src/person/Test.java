package person;

public class Test {
	public static void main(String[] args) {
        Person person = new Person("Nguyễn Văn An", "01/01/2000", "Hà Nội", 'M', "a@gmail.com", "0123456789");
        System.out.println(person.getName()); // in tên
        person.setName("Nguyễn Thị hong");
        System.out.println(person.getName()); // in tên sau khi thay đổi
        // in toàn bộ thông tin
        System.out.println(person);
    }
}
