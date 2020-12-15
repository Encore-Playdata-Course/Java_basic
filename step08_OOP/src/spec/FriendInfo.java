/* 필요성
 * 1. 개발자와 스펙을 제공하는 주체들과의 강제적인 rule
 * 2. 구현 방식
 * 	1. 기본 틀만 제공 - 고정 데이터와 메소드 구조에 대한 것만 제시
 * 	2. 개발 로직의 명령어만 제시 - 주석
 * 
 * 3. 대표적인 예시
 *  1. 벤더사들이 서로 다른 각 상용 DB와 연동되는 자바 프로그램들은
 *  	절대 DB 제품에 종속적인 코드로 개발하지 않음
 *  	모든 DB에 동일한 코드로 개발
 *  	- 표준 API : JDBC
 *  2. 사내 표준화에도 interface로 제시
 *  	- 소소한 세부 로직즐만 다양하게 개발하게 권장
 *  3. Spring Framework의 대부분도 다 interface로 설계
 * 4. 명명 규칙
 * 		1. 변수명 : 소문자 대문자 조합해서 선언
 * 		2. 상수명 : 대문자들로만 조합 단 여러 개의 단어들 조합 시 _표기
 */
package spec;

public interface FriendInfo {
	//회사 설립일자의 데이터 - 상수
	//public static 키워드가 생략 시에도 자동 적용
	public static final int COMPANY_BIRTHDAY = 2020;//company_birthday
	
	//회사명 데이터
	public static final String COMNAY_NAME = "PLAYDATA2강의장";
	
	/* 이 메소드의 반환 값은 현 작성자의 이름을 포함해ㅓ 회사명과 함께 문자열로 반환
	 * 미완성 메소드로 제시해야 함
	 * 	- 대신 반드시 자식 클래스로 완벽하게 메소드 구현해라!!
	 * 	- 상속받아서 재정의하라는 의미
	 * 
	 * public abstract 생략 시 자동 적용
	 */
	 public abstract String getInfo();
	 
	 //내 현 상태의 마음을 진솔하게 작성해서 반환
	 //내 짝꿍에게 하고 싶은 말
	 public abstract String heart();

}
