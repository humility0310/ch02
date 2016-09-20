package bit2016.paint;

public class PaintApp {
	public static void main(String[] args) {

		Point point = new Point();

		point.setX(100);
		point.setY(100);

		point.show();

		Point point2 = new Point(200, 200);
		point2.show(false);

		Point point3 = new ColorPoint(50, 50, "노란색");
		point3.show();
		point3.show(false);
		point3.show(true);

		Shape rectnagle = new Rectangle();
		drow(rectnagle);

		Shape circle = new Circle();
		drow(circle);

		Shape triangle = new Triangle();
		drow(triangle);

		drow(new Pentagon());

	}

	public static void drow(Shape shape) {
		shape.drow();
	}
}
