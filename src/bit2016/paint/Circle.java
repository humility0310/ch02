package bit2016.paint;

public class Circle extends Shape implements Drawable{
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private int radius;
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	@Override
	public void drow() {
		System.out.println("원을 그렸습니다.");
	}
	@Override
	public double calcultateArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}
	
}
