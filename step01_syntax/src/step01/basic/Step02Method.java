/* 학습내용
 * 1. 계산기 일부 로직을 활용해서 메소드 문법 습득
 * 2. 사칙연산 계산
 * 		기능 - 4개(메소드 4개)
 * 			메소드별 최소 필요한 변수 = 입력데이터 2개, 출력값 1개
 * 
 * 		연산시 필요한 최소 데이터 - 2개
 * 		: 2개의 입력 데이터 + 사칙연산식 = 결과
 * 		
 */
package step01.basic;

public class Step02Method {

	//+ 기능의 메소드 구현 : sum, 연산된 결과값은 호출한 곳으로 주기
	int sum(int v1, int v2) {
		int r = v1 + v2;
		return r;
	}
	
	void min(int v1, int v2) {
		System.out.println(v1 - v2);
	}
	
	
	public static void main(String[] args) {
		Step02Method s = new Step02Method();
		//더하기 기능의 메소드 호출
		int result = s.sum(3, 4);
		System.out.println(result);
		s.min(10, 2);
	}

}
