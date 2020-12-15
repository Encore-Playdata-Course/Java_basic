/* �н�����
 * 1. ���뼺�� ����� ����
 * 2. ��ü ���� ����
 * 	1. ��� ��� ������ �ʱ�ȭ �� ���� ����
 * 	2. name�� �ʱ�ȭ �� ���� ����
 * 	3. age���� �ʱ�ȭ �� ���� ����
 * 	..�߻��Ǵ� ����
 * 			�������� ������ �����ϰ� �������� ��Ȳ
 * 3. �ذ�å
 * 	- �ʿ��� ����(ȣ�� ����)�� �����ڸ� �������� �����ϴ� �������� �ؼ�
 * 4. ���� ���
 * 	- Builder pattern
 */
package model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Customer {
	//��� ����
	private String name; // ��ü �����ÿ� ��ü�� ���� �޸� ���ο� ���� �� ���� 
	private int age;
	private String grade; // vvip , vip , silver
	//Car�� ����� ��
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
}
