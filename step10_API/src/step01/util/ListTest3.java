package step01.util;

import java.util.ArrayList;

import model.domain.Car;
import model.domain.Customer;

public class ListTest3 {
	//Customer들을 ArrayList에 저장해서 반환 : db로부터 select해서 반환
	public static ArrayList<Customer> getDatas(){
		ArrayList<Customer> all = new ArrayList<>();
		
		all.add(Customer.builder().name("김민건").build());
		all.add(Customer.builder().name("권희성").build());
		all.add(Customer.builder().name("김창훈").build());		
		all.add(Customer.builder().car(new Car("그랜져", 77)).name("민건").build());
		
		return all;
	}
	//ArrayList에 저장된 Customer 객체들을 받아서 출력 : 브라우저에 출력 담당
	//html/css/java script... 으로 개발되는 화면
	public static void print(ArrayList<Customer> all) {
		for(Customer v : all) {
			System.out.println(v.getName());
		}
			 
		
		
	}
	public static void main(String[] args) {
		print(getDatas());
		
	}

}
