package example02;

public class Circle extends Shape {
	
	Point center;  //����
	int radius;    //������
	
	public Circle() {
		this(new Point(0,0), 100);
	}

	public Circle(Point center, int radius) {
		System.out.println("CircleŬ������ �Ű������� �ִ� ������ ȣ��");
		this.center = center;
		this.radius  = radius;
	}
	@Override
	public void draw() {
		System.out.println("���� : " + this.color);
		System.out.println("���� : ( x : " + this.center.x + ", y : " +
		                   this.center.y + ") , ������ : " + this.radius);
	}
}
