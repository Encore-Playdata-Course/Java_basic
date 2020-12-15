/* 학습 내용
 * 1. static {}
 * 	- byte code가 로딩 시에 자동 실행되는 블록
 * 	- 모든 user들이 공유하는 자원
 * 	- 단 1회로 실행 보장
 * 
 * 2. 실행 시 해당 파일의 main 메소드가 실행이 되기 위해서는 byte code가 메모리에 로딩 되어 있어야만 실행
 * 	다른 파일명 만으로 메모리에 로딩을 시도할 수도 있음
 * 	java로 db랑 소통(연동) db접속 및 활용을 위한  driver를 메모리에 로딩
 * 
 * 		diver 기능을 보유한 클래스명만 알고 있다면 어떻게 메모리에 로딩(저장)?
 * 		해결책
 * 			이름만 아는 클래스 명으로 byte code를 메모리에 저장ㅎ는 기능의 메소드를 호출
 * 
 * 			class를 메모리에 저장 시도시 발생 가능한 경우의 수
 * 			1. 존재하더라 - 정상 저장
 * 			2. 미존재하더라 - 저장 불가
 * 				1. 시스템 종료?
 * 				2. 아무 일 없는 것처럼 해당 로직 수행은 불가이나 그 이상의 로직들은 정상 실행 되는 것 처럼?
 * 3. IT 기본서양
 * 	- 상황에 따라 발생 가능한 경우의 수
 * 
 * 
 */
package step05.exception;
class A{
	static {
		System.out.println("A byte code 로딩");
	}
}
public class Step01Exception {
	
	public static void main(String[] args) {
		//A byte code를 메모리 저장 (로딩)
		System.out.println(1);
		
		//정상 실행 또는 오타가 존재할 경우 미정상 실행 두가지 경우의 수 있음
		try {
			Class.forName("step05.exception.A");
			//예외 발생 시 무시되는 영역
			System.out.println(2);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}		
		System.out.println(5);
	}	
}
/* 프로그램 실행시 발생 가능한 경우의 수 처리하는 기술 
[1] 발생되는 문제
1. 문법 오류
	문법 정상으로 수정 해야 만 컴파일 실행 가능
	Class.forName("step05.exception.A")의 경우
	try~catch 라는 독특한 문법 없이는 정상 컴파일 불가
	필수인 처리 문장이 절대적
2. 실행 오류
	문법 정상으로 수정
*/