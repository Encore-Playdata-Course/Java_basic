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
	//멤버 변수
	private String name; // 객체 생성시에 객체의 실제 메모리 내부에 생성 및 구성 
	private int age;
	private String grade; // vvip , vip , silver
	//Car를 멤버로 선언
	private Car car;
	
	
	
}
