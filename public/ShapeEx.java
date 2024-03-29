package example02;

public class ShapeEx {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.draw();
		System.out.println();
		
		Circle c2 = new Circle(new Point(150,150), 500);
		c2.draw();
		System.out.println();
		
		Triangle t1 = new Triangle();
		t1.draw();
		System.out.println();
		
		Point[] p = new Point[] { new Point(10,10),new Point(80,100),
								  new Point(20,120) };
		
		Triangle t2 = new Triangle(p);
		t2.draw();	
	}
}
