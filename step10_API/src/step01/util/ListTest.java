/* �н�����
 * 1. �����͵��� index�� �����ϴ� ���� �н�
 * 2. �ߺ� ���
 * 3. ��ü Ÿ�Կ� ���ؼ��� ����
 * 4. generic
 * 5. autoboxing / unboxing 
 * 	- �⺻ Ÿ�԰� ���� Ÿ�԰����� ����Ǵ� Ÿ�� ��ȯ ��ī����
 * 	- �ڵ�� �޸� ���� �ÿ� ��ȯ�Ǿ� Ȱ��
 * 		int i = new Integer(32) -> int i = (new Integer(32)).intValue();
 * 
 * �迭 Ư¡
 * 1. ���� ������
 * 2. []�� index�� ���� �� Ȱ��
 * 
 * ArrayList
 * 1. ���� ������
 * 2. ������ ����(add) �� Ȱ��(get) - �޼ҵ�
 * 3. ���� �� �����Ǵ� �޸𸮴� 10��, 11��° ������ ���� �� 10�� �߰�
 * 	  21��° ������ ���� �� �� 10�� �߰� ... 10���� �ʱ� �޸� ũ��, ����ġ
 */
package step01.util;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List all = new ArrayList();//���� �迭�� ������ ����
		
		//String�� Integer�� Object Ÿ������ ��ȯ�Ǹ鼭 ����
		all.add("���ڿ�"); //0��°
		all.add(new Integer(32)); //32 int ���� �Ұ� , ��ü�� ���� ���� ���� ��ü�� ���� �� ����
		all.add('c'); // 'c' -> Character ��ü�� ��ȯ�Ǿ� ����
		all.add("���ڿ�");
		all.add(new Byte("8"));
		
		System.out.println(all); // all.toString()[���ڿ�, 32, ���ڿ�, 8]
		all.remove(0);
		System.out.println(all);
		
		String v = (String)all.get(1);//���ڿ�
		System.out.println(v.length());
		
		System.out.println("------����ȥ ���� ��� ������ ���------");
		/* ���׸� �����̶� ���� ��� �ÿ��� Ÿ�Կ� ���� ����
		 * <Ÿ��>
		 * ���� : Object Ÿ���� Ư�� Ÿ������ ��ȯ
		 */
		List<String> al2 = new ArrayList<String>();
		al2.add("���ڿ�");
		String v2 = al2.get(0);
		System.out.println(v2.length()); //3
		
		System.out.println("=============�⺻Ÿ��(8����)�� ��ü Ÿ��(wrapper class)���� �ڵ� ��ȯ=============");
		// jdk1.5���� ����Ǵ� ����
		// �⺻Ÿ�� ������ ��ü ����(�� ����, �ʱ�ȭ)
		// ������ ��ü�� Integer Ÿ���� intValue()�� int �⺻ Ÿ������ ��ȯ�ؼ� ��ȯ
		// unboxing
		int i = new Integer(32);	// int i = (new Integer(32)).intValue();
		
		//��ü Ÿ�� ������ �⺻ �� ����
		//boxing ����
		Integer i2 = 32; //Integer i2 = new Integer(32);
		
		
	}

}