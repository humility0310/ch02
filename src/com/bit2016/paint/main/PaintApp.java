package com.bit2016.paint.main;

import com.bit2016.paint.i.Drawable;
import com.bit2016.paint.i.Resizable;
import com.bit2016.paint.point.Point;
import com.bit2016.paint.shape.Circle;
import com.bit2016.paint.shape.ColorPoint;
import com.bit2016.paint.shape.Pentagon;
import com.bit2016.paint.shape.Rectangle;
import com.bit2016.paint.shape.Shape;
import com.bit2016.paint.shape.Triangle;

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

		Drawable rectnagle = new Rectangle();
		drow(rectnagle);
		drow(new Circle());
		drow(new Triangle());
		drow(new Pentagon());

		drow(new ColorPoint(200, 100, "White"));

		resize(new Circle(10));

		// instanceof 테스트
		Circle c10 = new Circle();
		System.out.println(c10 instanceof Circle);
		// 오류 instansof는 상속관계에 있는 클래스만 확인할 수 있다.
		// System.out.println(c10 instanceof Rectangle); 형제관계 클래스가 아니라서
		System.out.println(c10 instanceof Shape);

		// instansof는 모든 인터페이스 에는 구현관계를 확인할 수 있다.
		System.out.println(c10 instanceof Drawable);
		System.out.println(c10 instanceof Resizable);

		Rectangle rect = new Rectangle();
		System.out.println(rect instanceof Rectangle);
		System.out.println(c10 instanceof Shape);
		System.out.println(c10 instanceof Drawable);
		System.out.println(c10 instanceof Resizable);
		
		resize2(new Rectangle());
	}

	public static void drow(Drawable drawable) {
		drawable.drow();
	}

	public static void resize2(Drawable drawable) {
		if (drawable instanceof Resizable == false) {
			return;
		}
			Resizable re = (Resizable) drawable;
			re.resize(0.8);
	}

	public static void resize(Resizable resizable) {
		Shape shape = (Shape) resizable;
		double area = shape.calcultateArea();

		System.out.println(area);
		resizable.resize(0.5);

		area = shape.calcultateArea();
		System.out.println(area);

	}
	// public static void drow(Shape shape) {
	// shape.drow();
	// }
}
