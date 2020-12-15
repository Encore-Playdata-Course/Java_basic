/* ������ ���� ���� �Ϸ�
 * - �ش� Ŭ������ �����ϰ� �ִ� ��� ����������� �޸𸮿� ��� �����ϰ� ���� �Ϸ�
 * - Parent2 ��ü ���� �Ϸ� = id�� age�� ��� ���� ������ heap�� ���� �Ϸ�
 * - ���
 * 		��� ���迡�� ���� �޴� ��� �������� ���� ���� �Ϸ�
 * - id/age�� ���� ������ �Ŀ� job�̶�� ���� ������ heap �߰��Ǿ� �����Ǵ� ����
 */
package step01.oop;


//class ���𱸿� extends �ڵ尡 �� �ڵ��� ������ "extends Object"
class Parent2 extends Object{
	String id;
	int age;
	Parent2(){
		super(); //parameter�� ������ �θ� ������ ȣ��
		System.out.println("�θ�2");
	}
	
	void printAll() {
		System.out.println(id);
		System.out.println(age);
		//100line �̻��� �����̶� ����
	}
	public String toString() {
		return "��ΰ�";
	}
}

//��� ���� ����, Parent�� ����ؼ� Ȯ���ϴ� Child Ŭ����
public class Child2 extends Parent2 {
	String job;
	//public Child2(){super();}
	Child2(){
		super(); // Object ��ü ���� -> Parent��ü ���� �Ϸ�(id, age ���� ����)
		System.out.println("�ڽ�2");
	}//job ���� ����
	void printAll() {
		super.printAll();
		System.out.println(job);
	}
	
	@Override //������ �ʼ�, �ڵ��� ��Ȯ���� ����
	//Object �� ���� ��ӹ��� �޼ҵ� ����
	public String toString() {
		return "��ΰ�";
	}
	public static void main(String[] args) {
		Child2 c = new Child2(); //�θ� ��ü ������ ������ �켱
		c.id = "�ڴٿ�id"; //id������ ����
		c.job = "IT man";
		c.printAll();
		//�⺻ Ÿ���� �����͸� ������ ��� ���� Ÿ���� ������ toString() �ڵ� ȣ��
		System.out.println(c);
		
	}

}
