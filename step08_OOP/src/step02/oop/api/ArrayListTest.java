/* �н� ����
 * 1. �ڵ�� ������ �ʿ伺 ü���ϱ�
 * 	- Ȯ���� ��.��.��
 * 	- ��� ������ �ڼ� Ÿ�Ե��� �� ���� Ÿ���� ����
 * 	- ����
 * 		���� Ÿ�� ���� = �ڼ�Ÿ�԰�ü;
 * 2. ����
 * 	- ��� ������ Ÿ�Ե��� �迭 �Ǵ� API���� �����ϴ� ������ Ȱ�� Ŭ������� ���� ���
 * 
 * 3. �迭
 * 	- �ټ��� �����͸� �ϰ� ���� �� Ȱ���� �ִ�ȭ �ϱ� ���� �ʼ� Ÿ��
 * 	- length �޸� ũ�Ⱚ ������ �ڵ� ����
 *  - Ÿ�Կ� ���� ������ ����
 *  	int[] - int ���� ���� �����͸�, String[]- string �����͸� ����
 *  	Customer [] - Customer�� ���� 
 */
package step02.oop.api;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//string /���� /������ /����... ������ Ÿ�԰� �����ϰ� �迭 ���Ŀ� ���� �� ����
		//�� ���� �� ��ü Ÿ���̾�� �� ������ �ִ� API�� �ټ� ����
		//�迭�� ��� / ��ü Ÿ�Ը� ���� / ���� ������ APIȰ��
		ArrayList al = new ArrayList();//10�� size�� �迭 �������� ����
		System.out.println(al.size());
		//������ ����
		al.add(0,"�ΰ�");
		al.add(0,new Integer(20));
		System.out.println(al.get(0));
	}

}
