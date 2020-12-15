/* 생성자 정상 실행 완료
 * - 해당 클래스가 보유하고 있는 모든 멤버변수들을 메모리에 사용 가능하게 생성 완료
 * - Parent2 객체 생성 완료 = id와 age의 멤버 변수 공간이 heap에 생성 완료
 * - 결론
 * 		상속 관계에선 물려 받는 멤버 변수들이 먼저 생성 완료
 * - id/age가 먼저 생성된 후에 job이라는 변수 공간에 heap 추가되어 생성되는 원리
 */
package step01.oop;


//class 선언구에 extends 코드가 미 코딩시 무조건 "extends Object"
class Parent2 extends Object{
	String id;
	int age;
	Parent2(){
		super(); //parameter가 동일한 부모 생성자 호출
		System.out.println("부모2");
	}
	
	void printAll() {
		System.out.println(id);
		System.out.println(age);
		//100line 이상의 로직이라 가정
	}
	public String toString() {
		return "김민건";
	}
}

//상속 관계 형성, Parent를 상속해서 확장하는 Child 클래스
public class Child2 extends Parent2 {
	String job;
	//public Child2(){super();}
	Child2(){
		super(); // Object 객체 생성 -> Parent객체 생성 완료(id, age 공간 생성)
		System.out.println("자식2");
	}//job 공간 생성
	void printAll() {
		super.printAll();
		System.out.println(job);
	}
	
	@Override //재정의 필수, 코드의 명확성을 선언
	//Object 로 부터 상속받은 메소드 수정
	public String toString() {
		return "김민건";
	}
	public static void main(String[] args) {
		Child2 c = new Child2(); //부모 객체 생성이 무조건 우선
		c.id = "박다영id"; //id변수도 존재
		c.job = "IT man";
		c.printAll();
		//기본 타입의 데이터를 제외한 모든 참조 타입은 무조건 toString() 자동 호출
		System.out.println(c);
		
	}

}
