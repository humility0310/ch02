package bit2016.goodsman.data;

public class Customer {
	public String name;
	protected String phone;
	private String email;
	
	void stName() {
//		public은 자기 안에서 가능
		name = "도우너";
//		protected는 자기 안에서 접근 가능
		phone = "010-2784-6635";
//		private는 자기 안에서 접근 가능
		email = "humility0310@gmail.com";
	}
}
