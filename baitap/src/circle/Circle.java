package circle;

import java.io.IOException;
import java.nio.CharBuffer;
interface GeometricObject {
	    double getPerimeter();
	    double getArea();
	}
interface Resizable {
	    void resize(int percent);
	}
public class Circle implements GeometricObject, Readable {
	
	
	    protected double radius;
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    public double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	    public void resize(int percent) {
	        radius *= (1 + percent / 100.0);
	    
	}
		public int read(CharBuffer cb) throws IOException {
			// TODO Auto-generated method stub
			return 0;
		}
	

}
