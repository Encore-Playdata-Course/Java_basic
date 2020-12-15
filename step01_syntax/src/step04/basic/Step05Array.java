/* 학습내용
 * 1. 배열
 * 	- 하나의 변수로 동일한 타입의 다수의 데이터를 활용 가능하게 하는 타입
 * 	- 기본 타입이 아님 따라서 참조(reference, object, class) 타입
 * 
 * 2. 참고
 * 	- 정수 3개를 저장해서 활용하는 프로그램이라 가정시 3개의 데이터를 개별적으로 관리
 * 	- int 타입의 변수 3개 필요
 * 	- 주의 사항 : 변수명은 동일 불가
 * 
 * 3. 배열 문법
 * 	[] - 배열의 표현식
 * 	타입 [] 변수명;
 * 	타입 변수명 [];
 * 
 * 4. 참고사항
 *  (parameter) - 메소드 구현, 생성자 구현시에 사용,
 *  	- 메소드, 생성자 호출 값 데이터 받기 위한 변수 선언
 *  	- void a(int no){} - 구현 / a(3) - 호출
 *  	- 호출시 값을 제공하기 위한 표현
 *  {로직을 구현하는 영역} - 메소드 구현, 생성자 구현시에 사용
 *  
 *  >java Step05Array
 *  실행환경의 실행 방식
 *  	Step05Array.main([..]);
 *  
 */
package step04.basic;

import step01.basic.Customer;

public class Step05Array {
	
	public static void main(String[] args) {
		//int값 3개로 하나의 배열을 생성 및 활용
		//생성시에 length 라는 변수가 자동 추가됫 생성, 배열 크기값 보유
		int [] i = new int[3]; //3개의 int값 저장 가능한 메모리 생성, 선언 생성
		i[0] = 1; //초기화
		i[1] = 2;
		i[2] = 3;
		System.out.println(i[2]+ " " +i.length);
		
		//선언 생성 초기화를 하나의 문장으로 사용
		//객체 생성 문법
		// new 생성자([..]) & " " & 배열 {}만으로 자동으로 객체가 됨
		int [] i2 = {1, 2, 3};
		System.out.println(i2[2]+ " " +i2.length);
		
		//String 배열 생성 및 활용
		String [] s = {"A","B","C"};
		System.out.println(s[0]); //A
		
		//import step01.basic.Customer;
		Customer [] c2 = {new Customer("김민건", 26, "v"),
						new Customer("권오민", 26, "v")}; //Customer 객체들
		System.out.println(c2.length); //2 배열의 크기값
		
		//?배열에서 index 0번째에 저장된 Customer 객체를 찾아서 그 객체가 보유한 3개의 데이터 중에 이름만 반환해서 출력
		/* c2[0]			Customer c1 = c2[0];
		 * c2 = 배열			String name = c1.getName();
		 * c2[0] = Customer System.out.println(name);
		 */
		System.out.println(c2[0].getName());
	}

}
