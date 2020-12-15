/* �н� ����
 * 1. �α��� ���� ����
 * 2. �ʿ� ������
 * 		- client�� �Է��ϴ� id/pw
 * 3. ��� 
 * 		- id/pw������ ������ �ؼ� ��ȿ�� ���?("��ȿ�� id") ��ȿ�� ���?("��ȿ�� id")
 * 		- id : playdata
 * 4. �ʿ� �ڵ�
 * 	1. String �� ����
 * 		- �̹� ����(������ ���̽� ����) �����ϴ� ����
 * 		- java�� ���ڿ� �� �� �޼ҵ�
 * 			public class String{
 * 				public boolean equals(String v){
 * 					�� ���ڿ� ��ü�� �� �����͸� �޾Ƽ� ��
 * 					true or false ��ȯ
 * 				}
 * 			}
 * 			String id = "playdata";
 * 			boolean r = id.equals("client�� �Է��� ������");
 * 
 * 5. ����
 * 	1. �� ��  == : ����� ������
 * 		�⺻ Ÿ��
 * 			���� �� ��
 * 			int i = 10; 
 * 			int i2 = 20;
 * 			i == i2 false
 * 
 * 		���� Ÿ��
 * 			��ü�� �ּ� ���� ��
 * 			��ü���� ���� �� �� �ÿ��� equals()�� ��		
 */
package step01;

import model.domain.Customer;

public class ValidationCheck {
	
	//���� ����
	public static String idCheck(String v) {
		if(v.equals("playdata")) {
			return "��ȿ��id";
		}else {
			return "��ȿ��id";
		}		
	}
	
	/* ? Customer �� ������ �ִ� ����
	 * �̸��� "���ھ�"
	 * �˻� �̸��� ���ھ� ��� age�� grade�� ���
	 * �ƴ϶�� "�� �ڰ� ����"��� ��ȯ
	 * 
	 */

	public static String nameCheck(String name){
		Customer p1 = new Customer("���ھ�",22,"vvip");
		if(p1.getName().equals("���ھ�")) {
			return p1.getAge() + " " + p1.getGrade();  
		}else {
			return "�� �ڰ� ����";
		}
	}
	
	
	
	public static void main(String[] args) {
		String message = idCheck("p");
		System.out.println(message); //��ȿ��id
		
		message = idCheck("playdata");
		System.out.println(message); //��ȿ��id
		
		//? �̸����� �� ���� �˻� ������ test �ڵ� �����ϱ�
		
		System.out.println(nameCheck("���ھ�"));
		
	}

}

	
