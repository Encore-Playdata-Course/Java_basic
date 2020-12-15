/* 학습내용
 * 1. 데이터를 어떻게 관리 및 활용할 것인가에 대한 해결 및 대안책으로 모든 언어가 지원하는 데이터 관리 구조
 * 2. 사번으로 사원정보(사번, 팀, 이름, 나이, 연락처...),
 * 	 학번으로 학생정보(학번, 반, 학년, 이름, 나이 , 연락처...) 관리하는 구조와 흡사한 구조 학습
 * 3. key와 value 구조
 * 		key : 사번 또는 학번
 * 		value : 중복도 가능한 구조의 실제 사용하고자 하는 데이터
 * 4. 참고
 * 	- jdk1.5부터의 API상에서 E(element), K(key), V(value)... Object로 간주
 * 5. 주요 API
 * 	- key와 value 구조
 * 	- 두 클래스는 다르지만 공통된 기본 구조 보유 : 스펙은 동일(interface는 하나)
 * 	- java.uti.Map 이라는 interface를 상속받아 구현하는 하위 클래스들
 * 	1. HashMap
 * 	2. Properties
 * 		- properties 라는 확장자 파일의 내용을 read해서 활용하는 기술
 * 		- 예시
 * 			DB 접속 정보만 별도로 properties 파일로 생성해서 코드 상에서 은닉
 * 			framework의 설정 정보 파일의 기본 설정 파일
 * 	3. JSON 포맷 학습
 * 		- JSON 포맷을 활용하는 API를 사용	
 * 		
 */
package step01.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("일", "playdata");
		map.put("이", "encore");
		map.put("삼", "강의장2");
		/*
		 * data를 HashMap에 저장해서 받음 단 key는 모름 그렇다면 key로 value를 활용해야 하는 map 사용 불가?
		 * 해결책(의사코드) 1단계 : HashMap 객체가 보유한 key들만 제공하는 메소드 호출해서 key만 반환 받음 2단계 : 해당 key들을
		 * 열거 순으로 정렬을 함(Iterator 객체로 변환) 3단계 : 존재 여부 확인 4단계 : 존재 - key 획득해서 value값 획득
		 * 미존재
		 */
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String Key = iterator.next();
			System.out.println(Key+" "+ map.get(Key));
		}

		System.out.println(map);// {이=encore, 일=playdata, 삼=강의장2}
		String v = map.get("일");
		System.out.println(v);
		
		map.put("일", "서초");
		v = map.get("일");
		System.out.println(v);
		String a = "1234";
		for(int i = 0 ; i<a.length();i++) {
			int b = a.charAt(i);
			System.out.println(b);
		}
	}

}
