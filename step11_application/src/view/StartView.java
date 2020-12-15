package view;

import java.util.ArrayList;

import controller.CustomerController;
import model.domain.Customer;

public class StartView {
	//모든 검색 -> 저장 -> 모든 검색 또는 해당 고객 검색 -> 수정 -> 모든 검색 또는 해당 고객 검색
	//->삭제 -> 모든 검색 또는 해당 고객 검색
	/* Client가 1 선택 시 - 모두 고객 정보 검색 요청이라 간주
	 * 		   2  선택 시 - 한명의 고객 정보 검색
	 * 		   3  선택 시 - 수정
	 * 		   4  선택 시 - 삭제
	 * 		   5  선택 시 - 저장
	 */
	public static void main(String[] args) {
		System.out.println("--1. 모든 고객 정보 검색 --");
		CustomerController.reqProcess(1);
		
		System.out.println("--2. 저장 후 검색 --");
		CustomerController.reqProcess(2);
		CustomerController.reqProcess(1);

		System.out.println("--3. 저장 후 검색 --");
		CustomerController.reqProcess(3);
		CustomerController.reqProcess(1);
		
		System.out.println("--4. 저장 후 검색 --");
		CustomerController.reqProcess(4);
		CustomerController.reqProcess(1);
		
		System.out.println("--5. 저장 후 검색 --");
		CustomerController.reqProcess(5);
		CustomerController.reqProcess(1);
		int k = 0/5;
	}
}
