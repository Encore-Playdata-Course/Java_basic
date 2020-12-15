package step01.util;

import java.util.ArrayList;

import model.domain.Car;
import model.domain.Customer;

public class ListTest2 {
	//Customer���� ArrayList�� �����ؼ� ��ȯ : db�κ��� select�ؼ� ��ȯ
	
	//ArrayList�� ����� Customer ��ü���� �޾Ƽ� ��� : �������� ��� ���
			
	public static void main(String[] args) {
		//jdk1.7���� new ArrayList<> �� <> ���ο� Type ������� �ʴ� ���� ���
		ArrayList<Customer> all = new ArrayList<>();
		Customer c = Customer.builder().name("��ΰ�").build();
		all.add(c);
		all.add(Customer.builder().name("����").build());
		all.add(Customer.builder().name("��â��").build());
		
		//jdk 1.5 ���� �߰��� �ݺ��� - forEach �ݺ���
		for(Customer v : all) {
			System.out.println(v.getName());
		}
		System.out.println("------------if, ���ڿ� �� : equals()-------------");
		for(Customer v : all) {
			if(v.getName().equals("����")) {
				System.out.println(v.getName());
			}
		}
		System.out.println("--------------Customer�� ������ Car ��ü �ʱ�ȭ----------");
		Car car = new Car("�׷���", 77);
		Customer c3 = Customer.builder().car(car).name("�ΰ�").build();
		System.out.println(c3);
		
		all.add(c3);
		/*? ArrayList�� (c3������)����� �������� �� ��ȣ�� ���
		 * ArrayList -> Customer -> Car -> ����ȣ
		 */
		System.out.println(all.get(3).getCar().getCarNumber());
		//���׸� ������ �ȵ� ArrayList�� ������ ���
		System.out.println( ((Customer)all.get(3)).getCar().getCarNumber());
		//ArrayList�� ����� ������ Ȱ��
		Customer getCust = all.get(3);
		Car myCar = getCust.getCar();
		int number = myCar.getCarNumber();
		System.out.println(number);
		
	}

}
