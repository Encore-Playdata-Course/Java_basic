package step01.oop;

import java.util.ArrayList;

class Parent3 extends Object {
	String id;
	int age;
	void printAll() {
		System.out.println(id);
		System.out.println(age);
	}

}

public class Child3 extends Parent3 {
	String job;
	void printAll() {
		super.printAll();
		System.out.println(job);
	}
	
	static Object m() { //Object ���� = "���ڿ�"; String ��ü�� object�� �ڵ� ����ȯ
		return "���ڿ�";
	}
	/* ���� : public boolean add(object o){}
	 * 		���� ������ �°� index 0���� �ڵ��ο� �ϸ鼭 ���������� ������ ����
	 * 
	 * �����ϴ� �����͸� ��ȯ : public String? Integer? Object? get(int index)?
	 * ---> public Object get(int index){}
	 * 		�ش� index�� ����� ������ ��ȯ
	 * 
	 * �����ϴ� �����͸� ���� : public 
	 * 		�ش� index�� �������� ����
	 */
	static void m2() {
		//object []
		ArrayList al = new ArrayList();//10�� size�� �迭 �������� ����
		
		al.add("�ΰ�");			// String -> Object ��ȯ
		al.add(new Integer(20));// Integer
		al.add(new Child()); // Child���� toString() ������ �� ����
		
		//�ݺ��� Ȱ���ؼ� �� ��ü���� ������ toString() �޼ҵ� ȣ���ؼ� ���
		//for / print() or println()
		/* ���� 1 : toString()�� Object�� �޼ҵ尡 ȣ���� �ɱ��?
		 * 		String or Integer ��ü��� String or Integer
		 * 		Ŭ������ �����ǵ� toString()�� ȣ��ɱ��??
		 * �����ǵ� toString()��� -- �ڽ� �޼ҵ���� ȣ��
		 * 
		 */
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); //index�� ������ ��ȯ
		}
		System.out.println("--------");
		System.out.println(al.get(0));
		al.remove(0);
		System.out.println(al.get(0));
	}
	public static void main(String[] args) {
		//�ڼո��� ����� ���� ���� Ÿ�Կ��� access(ȣ��) �Ұ�
		//�ڼո��� ��� ȣ���� ���ؼ��� �ݵ�� ����ȯ �ʼ�
		String s = (String) m();
		System.out.println(s.charAt(0)); //��
		/* ������ �ܰ�
		 * 	- Parent3 �����ϵǰ� �ش� byte code�� �ڽ� Ŭ���� Ȯ��
		 * ���� �ܰ�
		 *  - �ڽ� ���ο� ���� ���θ� Ȯ���ؼ� �ڽ��� �޼ҵ带 �����ϰ� �ִٸ� ����
		 *  Ȥ�� �ڽ� Ŭ������ �ش� �޼ҵ尡 ���ٸ� �θ� Ŭ������ �������� �޼ҵ� ����
		 */
		//�ڵ� ����ȯ
		Parent3 p = new Child3(); //������ : ���� Ÿ�� ���� = �ڽİ�ü;
		p.printAll(); //�����ǵ� �ڽ� Ŭ������ �޼ҵ尡 ����
		p.id = "tester";
		p.age = 10;
		
		//p.job = "IT man";
		
		Child3 c = (Child3)p; // ������� ����ȯ
		c.job = "IT man";
		m2();
		System.out.println();
	}

}
