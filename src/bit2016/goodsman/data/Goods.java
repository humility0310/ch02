package bit2016.goodsman.data;

public class Goods {
	public Goods(){
		System.out.println("저는 생성자 입니다.");
		count++;
	}
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	public static int count;//static변수, class변수

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
}
