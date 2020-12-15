/* 학습내용
 * 1. 데이터 표현 방법
 * -변수
 * -타입 변수명 [=값];
 * 	
 * 2. 변수 만들기 / 활용하기
 */
package step01.basic;

public class Step01Variable {

	public static void main(String[] args) {
		//정수(byte, short, int, long) 저장하는 변수 선언만
		int age; //32bit 메모리 공간 생성, age라는 이름으로 관리
		
		//false 정보 저장하는 변수와 값을 대입(=초기화)
		//true or false만 저장 가능한 메모리 생성 및 false 값 저장
		boolean result = false;
		
		System.out.println(result);
		
		//64bit 정수
		long l = 100;
		age = (int)l; // 형변환(type casting/upcasting?x/downcasting?o)
		System.out.println(age);
		/* 3, 3.5
		 * 3+4 = 7/2 = 3.5 실수
		 *
		 * (byte)(b1 + b2)
		 * 1단계 : b1+b2
		 * 2단계 : (byte)
		 * 
		 * (byte)b1 + b2
		 * 1단계 : (byte)b1
		 * 2단계 : (byte)b1 + b2
		 * 결론 : int타입을 자동으로 변환
		 */
		byte b1 =3;
		byte b2 =4;
		byte b3 = (byte)(b1 + b2) ; // 연산시 더 큰 사이즈로 변환될 확률이 높다.
		System.out.println(b3/2); // 3
		float f3 = b3/2;
		System.out.println(f3); //3.0
		float f4 = b3/2.0f;
		System.out.println(f4); //3.5 = (float)(b3/2.0) = b3/(float)2.0

		//32bit
		float f1 = (float)3.7; // 3.7F 나 3.7f도 가능
		//64bit 정수에 32bit 실수값 대입
		//내부적으로 모든 실수는 모든 정수보다 더 큰 사이즈의 메모리를 사용
		//모든 실수는 모든 정수 변수에 대입시 형변환 필수
		long l2 = (long)f1;
	}

}
