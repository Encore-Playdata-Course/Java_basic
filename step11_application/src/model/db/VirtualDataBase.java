//database�� ����
package model.db;

import java.util.ArrayList;

import lombok.ToString;
import model.domain.Customer;
@ToString
public class VirtualDataBase {
	private static ArrayList<Customer> all = new ArrayList<>();
	
	// �� ���� ����
	static {
		all.add(new Customer("�ٿ�", 10,"vvip"));
		all.add(new Customer("����", 20,"vip"));
		all.add(new Customer("��", 30,"diamond"));
		all.add(new Customer("�ΰ�", 40,"platinum"));
	}
	// �� ����
	public static ArrayList<Customer> getCustomers(){
		return all;
	}
}
