package circle;

public class Test {
	public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(5.0);
        System.out.println("Chu vi ban đầu: " + circle.getPerimeter());
        System.out.println("Diện tích ban đầu: " + circle.getArea());

        circle.resize(20); 
        System.out.println("Chu vi sau khi tăng kích thước: " + circle.getPerimeter());
        System.out.println("Diện tích sau khi tăng kích thước: " + circle.getArea());
    }

}
