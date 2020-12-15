//sql�� ���� ����ؼ� DB�� ���� �����ϴ� Ŭ������ ��ȯ
package model;

import java.util.ArrayList;

import model.db.VirtualDataBase;
import model.domain.Customer;

public class CustomerModel {
	private ArrayList<Customer> datas = VirtualDataBase.getCustomers();
	// ��� �� �˻� - �� ���� ��ȯ
	public ArrayList<Customer> getCustomers(){
		return datas;
	}
	// �� �˻�
	public Customer getCustomer(String id) {
		for(Customer c : datas) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	
	// �� ���� - 3���� �����Ͱ� �� ���� �� ����
	/* parameter�� Customer Ÿ��? 
	 * String id, int age, String grade ������
	 * ������ ��� - ���ܹ߻�(�ߺ��� id��� �޼����� ����)
	 * �������� ��� - ����
	 */
	public void insert(Customer c) throws Exception{
		// id �ߺ� ���� ���� �� �������� ��쿡�� add
//		for(Customer v : datas) {
//			if(v.getId().equals(c.getId())) {
//				throw new Exception("id�� �ߺ� ���� �Ұ�");
//			}else {
//				datas.add(c);
//				break;
//			}
//		}
		Customer v = getCustomer(c.getId());
		if(v==null) {
			datas.add(c);
		}else {
			throw new Exception("id�� �ߺ� ���� �Ұ�");
		}
	}
	// �� ���� ����
	/* ���� ���� : true / ������ ���� : false
	 * id������ ��޼��� ����
	 * 1. id�� �����Ѵ� - ���� true ��ȯ
	 * 2. id�� ������ - ���� �Ұ� false ��ȯ
	 */
	public boolean update(String id, String newGrade) {
		boolean result = false;
		Customer v = getCustomer(id);
		if(v != null) {//null�� �ƴ� �� ���� ����
			v.setGrade(newGrade);
			result = true;
		}
		return result;
	}
	// �� ���� - ���� ������ 1 ��ȯ , ���� ���� �� 0 ��ȯ
	/* ArrayList�� ����� Customer �� ArrayList�� ������ ���� - remove(int index), remove(objcet o)
	 * 
	 */
	public int delete(String id) {
		int result = 0;
		Customer v = getCustomer(id);
		if(v != null) {//null�� �ƴϴ� = Customer ����
			if(datas.remove(v)==true) {
				result =1;
			}
		}
		return result;
	}
	public static void main(String[] args){
		CustomerModel c = new CustomerModel();
		System.out.println(c.datas);
		c.delete("��");
		System.out.println(c.datas);
		
//		try {
//			c.insert(new Customer("����", 10,"vvip"));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			c.insert(new Customer("�ٿ�", 30,"vvip"));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		c.getCustomers().get(3).setGrade("gold");
//		System.out.println(c.getCustomers());
//		System.out.println(c.getCustomers().get(3).getGrade().charAt(3));
		
	}
}
