package view;

import java.util.ArrayList;

import model.domain.Customer;

public class EndView {

	public static void invalidateReq(String message) {
		System.out.println("발생된 문제: " +message);
	}
	
	public static void validateReq(String message) {
		System.out.println("정상 실행: " +message);
	}
	
	public static void viewCust(Customer cust) {
		System.out.println("검색된 고객 정보 : "+cust);//cust.toString()
	}

	public static void viewCustAll(ArrayList<Customer> all) {
		System.out.println("모든 고객 정보");
		for(Customer v : all) {
			System.out.println(v);
		}
	}

}
