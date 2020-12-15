package model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString //��� ��� ������ ���� �ϳ��� ���ڿ��� �����ؼ� ��ȯ
public class Customer {
	//��� ����
	private String id; 
	private int age;
	private String grade; 
	
}
