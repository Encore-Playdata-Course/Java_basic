/* 객체 생성을 위한 생성자는 개발자가 미코딩시 자동으로 추가(기본 생성자)
 * 생성자{} 내부에는 출력 로직도 가능...
 */
package step04.basic;

class A {
	int no = 10;
	A(){
		System.out.println("A");
	}
	int getNo() {
		return no;
	}
}

class B {
	A a = new A();
	B(){
		System.out.println("B");
	}
}

class C {
	B b = new B();
	C(){
		System.out.println("C");
	}
}

public class Step04Review {

	public static void main(String[] args) {
		/*
		 * 미션 1 - A 클래스의 no 변수값 출력 
		 * 미션 2 - 객체 생성 순서? a-b-c
		 */
		C c = new C();
		System.out.println(c.b.a.no);
		System.out.println("A->B->C");
	}

}
