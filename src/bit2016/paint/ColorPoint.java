package bit2016.paint;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color){
		setX(x);
		setY(y);
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void show(){
		System.out.println("x = " + this.getX() + 
							", y = " + this.getY() +
							"을 "+color+"으로 그렸습니다.");
	}
}
