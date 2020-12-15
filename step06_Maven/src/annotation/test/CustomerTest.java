package annotation.test;

import model.domain.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer c = new Customer("a", 1, "c");
		Customer c = Customer.builder().name("강감찬").build();
		System.out.println(c.toString());
		
		Customer c2 = Customer.builder().name("연개소문").age(100).build();
		System.out.println(c2.toString());
	}

}
