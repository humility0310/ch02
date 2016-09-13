package bit2016.goodsman.data;

public class CustomerVIP extends Customer {
	void setName() {
//		public은 자식 패키지 접근가능
		name = "둘리";
//		protected는 자식에서 접근가능
		phone = "010-2784-6635";
//		private는 자기 안에서 접근 불가능
//		email = "humility0310@gmail.com";
	}
}
