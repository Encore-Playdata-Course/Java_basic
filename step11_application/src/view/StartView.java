package view;

import java.util.ArrayList;

import controller.CustomerController;
import model.domain.Customer;

public class StartView {
	//��� �˻� -> ���� -> ��� �˻� �Ǵ� �ش� �� �˻� -> ���� -> ��� �˻� �Ǵ� �ش� �� �˻�
	//->���� -> ��� �˻� �Ǵ� �ش� �� �˻�
	/* Client�� 1 ���� �� - ��� �� ���� �˻� ��û�̶� ����
	 * 		   2  ���� �� - �Ѹ��� �� ���� �˻�
	 * 		   3  ���� �� - ����
	 * 		   4  ���� �� - ����
	 * 		   5  ���� �� - ����
	 */
	public static void main(String[] args) {
		System.out.println("--1. ��� �� ���� �˻� --");
		CustomerController.reqProcess(1);
		
		System.out.println("--2. ���� �� �˻� --");
		CustomerController.reqProcess(2);
		CustomerController.reqProcess(1);

		System.out.println("--3. ���� �� �˻� --");
		CustomerController.reqProcess(3);
		CustomerController.reqProcess(1);
		
		System.out.println("--4. ���� �� �˻� --");
		CustomerController.reqProcess(4);
		CustomerController.reqProcess(1);
		
		System.out.println("--5. ���� �� �˻� --");
		CustomerController.reqProcess(5);
		CustomerController.reqProcess(1);
		int k = 0/5;
	}
}
