package step01.util;

import java.util.ArrayList;

import model.domain.Car;
import model.domain.Customer;

public class ListTest2 {
	//Customer들을 ArrayList에 저장해서 반환 : db로부터 select해서 반환
	
	//ArrayList에 저장된 Customer 객체들을 받아서 출력 : 브라우저에 출력 담당
			
	public static void main(String[] args) {
		//jdk1.7부터 new ArrayList<> 즉 <> 내부에 Type 기술하지 않는 문법 허용
		ArrayList<Customer> all = new ArrayList<>();
		Customer c = Customer.builder().name("김민건").build();
		all.add(c);
		all.add(Customer.builder().name("권희성").build());
		all.add(Customer.builder().name("김창훈").build());
		
		//jdk 1.5 부터 추가된 반복문 - forEach 반복문
		for(Customer v : all) {
			System.out.println(v.getName());
		}
		System.out.println("------------if, 문자열 비교 : equals()-------------");
		for(Customer v : all) {
			if(v.getName().equals("권희성")) {
				System.out.println(v.getName());
			}
		}
		System.out.println("--------------Customer가 보유한 Car 객체 초기화----------");
		Car car = new Car("그랜져", 77);
		Customer c3 = Customer.builder().car(car).name("민건").build();
		System.out.println(c3);
		
		all.add(c3);
		/*? ArrayList에 (c3변수값)저장된 데이터의 차 번호만 출력
		 * ArrayList -> Customer -> Car -> 차번호
		 */
		System.out.println(all.get(3).getCar().getCarNumber());
		//제네릭 적용이 안된 ArrayList를 가정한 경우
		System.out.println( ((Customer)all.get(3)).getCar().getCarNumber());
		//ArrayList에 저장된 데이터 활용
		Customer getCust = all.get(3);
		Car myCar = getCust.getCar();
		int number = myCar.getCarNumber();
		System.out.println(number);
		
	}

}
