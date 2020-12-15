/* 학습내용
 * 1. 데이터들을 index로 관리하는 구조 학습
 * 2. 중복 허용
 * 3. 객체 타입에 한해서만 관리
 * 4. generic
 * 5. autoboxing / unboxing 
 * 	- 기본 타입과 참조 타입간에만 적용되는 타입 변환 메카니즘
 * 	- 코드와 달리 실행 시에 변환되어 활용
 * 		int i = new Integer(32) -> int i = (new Integer(32)).intValue();
 * 
 * 배열 특징
 * 1. 고정 사이즈
 * 2. []로 index로 저장 및 활용
 * 
 * ArrayList
 * 1. 동적 사이즈
 * 2. 데이터 저장(add) 및 활용(get) - 메소드
 * 3. 생성 시 생성되는 메모리는 10개, 11번째 데이터 저장 시 10개 추가
 * 	  21번째 데이터 저장 시 또 10개 추가 ... 10개가 초기 메모리 크기, 증가치
 */
package step01.util;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List all = new ArrayList();//동적 배열과 동일한 구조
		
		//String과 Integer가 Object 타입으로 변환되면서 저장
		all.add("문자열"); //0번째
		all.add(new Integer(32)); //32 int 저장 불가 , 객체만 저장 가능 따라서 객체로 생성 후 저장
		all.add('c'); // 'c' -> Character 객체로 변환되어 저장
		all.add("문자열");
		all.add(new Byte("8"));
		
		System.out.println(all); // all.toString()[문자열, 32, 문자열, 8]
		all.remove(0);
		System.out.println(all);
		
		String v = (String)all.get(1);//문자열
		System.out.println(v.length());
		
		System.out.println("------형변혼 없이 사용 가능한 기술------");
		/* 제네릭 문법이란 것을 사용 시에는 타입에 대한 제한
		 * <타입>
		 * 장점 : Object 타입을 특정 타입으로 변환
		 */
		List<String> al2 = new ArrayList<String>();
		al2.add("문자열");
		String v2 = al2.get(0);
		System.out.println(v2.length()); //3
		
		System.out.println("=============기본타입(8가지)과 객체 타입(wrapper class)간의 자동 변환=============");
		// jdk1.5부터 적용되는 문법
		// 기본타입 변수에 객체 대입(값 저장, 초기화)
		// 생성된 객체인 Integer 타입을 intValue()로 int 기본 타입으로 변환해서 반환
		// unboxing
		int i = new Integer(32);	// int i = (new Integer(32)).intValue();
		
		//객체 타입 변수에 기본 값 대입
		//boxing 명명
		Integer i2 = 32; //Integer i2 = new Integer(32);
		
		
	}

}
