/* 학습 내용
 * 1. 예외 처리 문법 숙지
 * 
 * 2. 예외 종류
 * 	1. 컴파일 계열
 * 		- try~catch 예외 처리 문장 필수
 * 	2. 런타임 계열
 * 		- try~catch 예외 처리 문장 옵션
 * 		- java.lang.RuntimeException이라는 클래스와 여관이 있는 모든 ~Exception들
 * 
 * 3. 문법
 * 	1. try~catch
 * 	2. try~catch~finally
 * 	3. 예외 발생 지점에서 처리가 아니라 이 로직을 요청한 쪽으로 예외 처리 위임(알림)
 * 		- throws ~예외
 * 		- 메소드 선언구
 */

package step05.exception;

class B {
	static {
		System.out.println("B byte code 로딩");
	}
}

public class Step02Exception {
	static void m1() {
		try {
			Class.forName("step05.exception.B");
			System.out.println("예외 미 발생시에만 실행되는 로직");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 예외 발생 시 모든 history 출력
		}
		System.out.println("m1() 실행완료");
	}

	// 시스템 자원을 사용했을 땐 자원 반환 코드가 필수
	// 자원 반환 실행을 100% 보장하는 문법
	static void m2() {
		try {
			Class.forName("step05.exception.B--");
			System.out.println("예외 미 발생시에만 실행되는 로직");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 예외 발생 시 모든 history 출력
		} finally {
			System.out.println("100% 실행 보장");
		}
		System.out.println("m1() 실행완료");
	}

	// 문제가 생기면 이 메소드를 호출한 곳으로 예외 처리 위임
	static void m3() throws ClassNotFoundException {
		Class.forName("step05.exception.B---");
	}

	// id가 무효한 경우 String값으로 반환
	/* 무효한 id라면 예외를 발생 시켜서 호출한 곳으로 예외를 던짐
	 * java.lang.Exception 클래스 사용
	 * 예외 객체 생성 + 메세지 저장 -> 발생 시에 예외 메세지 활용
	 */
	public static String idCheck(String v) throws Exception{
		if (v.equals("playdata")) {
			return "유효한id";
		} else {
			throw new Exception("무효한 id.. 너 헤커 아니니?");
		}
	}

	public static void main(String[] args) {
//		try {
//			m3();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		try {
			idCheck("hi");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("반드시 서비스해야 할 로직");
		// m2();
		// m1();
	}
}
