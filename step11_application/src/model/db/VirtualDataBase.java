//database로 간주
package model.db;

import java.util.ArrayList;

import lombok.ToString;
import model.domain.Customer;
@ToString
public class VirtualDataBase {
	private static ArrayList<Customer> all = new ArrayList<>();
	
	// 고객 정보 저장
	static {
		all.add(new Customer("다영", 10,"vvip"));
		all.add(new Customer("왕현", 20,"vip"));
		all.add(new Customer("준", 30,"diamond"));
		all.add(new Customer("민건", 40,"platinum"));
	}
	// 고객 제공
	public static ArrayList<Customer> getCustomers(){
		return all;
	}
}
