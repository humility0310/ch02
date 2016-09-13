package bit2016.goodsman.db;

import bit2016.goodsman.data.Customer;

public class CustomerDB {
	void insert() {
		Customer c = new Customer();
//		public은 다른패키지에서 접근 가능
		c.name = "김영조";
//		protested는 다른 패키지에서 접근 불가
//		c.phone = "010-2784-6635";
//		private는 자기 안에서 접근 불가
//		c.email = "humility0310@gmail.com";
	}
}
