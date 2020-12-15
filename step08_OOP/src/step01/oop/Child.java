package step01.oop;

class Parent extends Object{
	String id;
	int age;
	
	void printAll() {
		System.out.println(id);
		System.out.println(age);
		//100line 이상의 로직이라 가정
	}
	
}

//상속 관계 형성, Parent를 상속해서 확장하는 Child 클래스
public class Child extends Parent {
	String job;
	
	void printAll() {
		super.printAll();
		System.out.println(job);
	}
	
	public static void main(String[] args) {
		Child c = new Child(); //객체 생성시 모든 멤버 변수들은 기본 값으로 초기화
		c.id = "박다영id"; //id변수도 존재
		c.job = "IT man";
		c.printAll();//printAll() 존재
		
	}

}
