/* 학습 내용
 * 1. 코드로 다형성 필요성 체감하기
 * 	- 확장의 끝.장.판
 * 	- 상속 관계의 자손 타입들을 다 상위 타입이 수용
 * 	- 문법
 * 		상위 타입 변수 = 자손타입객체;
 * 2. 주제
 * 	- 상속 관계의 타입들을 배열 또는 API에서 제공하는 데이터 활용 클래스들로 관리 방법
 * 
 * 3. 배열
 * 	- 다수의 데이터를 일괄 관리 및 활용을 최대화 하기 위한 필수 타입
 * 	- length 메모리 크기값 변수가 자동 생성
 *  - 타입에 대한 제한이 있음
 *  	int[] - int 범위 내의 데이터만, String[]- string 데이터만 저장
 *  	Customer [] - Customer만 저장 
 */
package step02.oop.api;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//string /나이 /거주지 /핸펀... 데이터 타입과 무관하게 배열 형식에 저장 및 관리
		//다 가능 단 객체 타입이어야 함 제약이 있는 API들 다수 제공
		//배열과 흡사 / 객체 타입만 저장 / 동적 사이즈 API활용
		ArrayList al = new ArrayList();//10개 size의 배열 생성으로 간주
		System.out.println(al.size());
		//데이터 저장
		al.add(0,"민건");
		al.add(0,new Integer(20));
		System.out.println(al.get(0));
	}

}
