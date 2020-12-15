/* 학습내용
 * 1. static 키워드
 * 2. 특징
 * 	- 객체 생성없이도 선언된 변수와 메소드는 호출해서 사용이 가능
 * 3. 필요성
 * 	- 객체 자체가 필요하지 않고 메소드 기능이 필요한 경우에 객체 생성없이 메소드 실행만 가능하게 하고자 할 때
 * 	- 모든 사용자들이 공유하는 유일한 자원을 변수로 활용하고자 할 때 변수에 선언
 * 		:객체 수와 무관하게 모든 객체가 공유하는 유인한 변수로 선언시에 사용
 * 4. 문법
 * 	1. 변수 : static 타입 변수명;
 * 	2. 메소드	: static 리턴타입 메소드명(){}
 * 	3. static{} : 
 * 		byte code가 메모리에 로딩시 단 한번만 실행
 * 		모든 user들이 공유하는 자원을 단 한번 초기화 해야할 경우
 */
package step04.basic;

public class Step02Static {
	//멤버 변수들은 메모리에 최초 생성시 무조건 자동 초기화(default 초기화)
	int a;		  //객체 생성 후에만 사용 가능
	static int b; //객체 생성하지 않고도 사용 가능
	
	Step02Static(){
		a++; //a값 1 증가하는 증가 연산자 a = a+1과 동일
		b++;
	}
	public static void main(String[] args) {
//		System.out.println(a);
		System.out.println(b);
		Step02Static s = new Step02Static();
		System.out.println(s.a + " " + b); // 1 1
		
		Step02Static s2 = new Step02Static();
		System.out.println(s2.a + " " + b);// 1 2
		/* java.lang.system
		 * out : System 클래스에 static 으로 선언 따라서 클래스 이름으로 호출
		 * 		System.out
		 * println() : 실제 출력 가능
		 * 			PrintStream에서 제공
		 */
		System.out.println(Step02Static.b);
	}

}
