/* �н�����
 * 1. �����͸� ��� ���� �� Ȱ���� ���ΰ��� ���� �ذ� �� ���å���� ��� �� �����ϴ� ������ ���� ����
 * 2. ������� �������(���, ��, �̸�, ����, ����ó...),
 * 	 �й����� �л�����(�й�, ��, �г�, �̸�, ���� , ����ó...) �����ϴ� ������ ����� ���� �н�
 * 3. key�� value ����
 * 		key : ��� �Ǵ� �й�
 * 		value : �ߺ��� ������ ������ ���� ����ϰ��� �ϴ� ������
 * 4. ����
 * 	- jdk1.5������ API�󿡼� E(element), K(key), V(value)... Object�� ����
 * 5. �ֿ� API
 * 	- key�� value ����
 * 	- �� Ŭ������ �ٸ����� ����� �⺻ ���� ���� : ������ ����(interface�� �ϳ�)
 * 	- java.uti.Map �̶�� interface�� ��ӹ޾� �����ϴ� ���� Ŭ������
 * 	1. HashMap
 * 	2. Properties
 * 		- properties ��� Ȯ���� ������ ������ read�ؼ� Ȱ���ϴ� ���
 * 		- ����
 * 			DB ���� ������ ������ properties ���Ϸ� �����ؼ� �ڵ� �󿡼� ����
 * 			framework�� ���� ���� ������ �⺻ ���� ����
 * 	3. JSON ���� �н�
 * 		- JSON ������ Ȱ���ϴ� API�� ���	
 * 		
 */
package step01.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("��", "playdata");
		map.put("��", "encore");
		map.put("��", "������2");
		/*
		 * data�� HashMap�� �����ؼ� ���� �� key�� �� �׷��ٸ� key�� value�� Ȱ���ؾ� �ϴ� map ��� �Ұ�?
		 * �ذ�å(�ǻ��ڵ�) 1�ܰ� : HashMap ��ü�� ������ key�鸸 �����ϴ� �޼ҵ� ȣ���ؼ� key�� ��ȯ ���� 2�ܰ� : �ش� key����
		 * ���� ������ ������ ��(Iterator ��ü�� ��ȯ) 3�ܰ� : ���� ���� Ȯ�� 4�ܰ� : ���� - key ȹ���ؼ� value�� ȹ��
		 * ������
		 */
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String Key = iterator.next();
			System.out.println(Key+" "+ map.get(Key));
		}

		System.out.println(map);// {��=encore, ��=playdata, ��=������2}
		String v = map.get("��");
		System.out.println(v);
		
		map.put("��", "����");
		v = map.get("��");
		System.out.println(v);
		String a = "1234";
		for(int i = 0 ; i<a.length();i++) {
			int b = a.charAt(i);
			System.out.println(b);
		}
	}

}
