package model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Customer {
	//��� ����
	private String name; // ��ü �����ÿ� ��ü�� ���� �޸� ���ο� ���� �� ���� 
	private int age;
	private String grade; // vvip , vip , silver
	//Car�� ����� ����
	private Car car;
	
	
	
}
