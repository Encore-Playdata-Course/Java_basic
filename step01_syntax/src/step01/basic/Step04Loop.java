/* 학습내용
 * 1. 반복문
 * 2. 필요한 기준
 * 		시작점, 조건식, 증감식
 * 		시작점에서 반복을 시작하나, 증감식을 거쳐서 데이터를 변환해 가면서 조건이 true인 경우에만 실행
 * 3. 권장 사항
 * 	1. for - 반복 횟수가 대략 정해져 있을 때 권장
 * 	2. while - 무한 반복 or 반복 횟수가 불명확할 때 권장
 * 	3. do-while - 무조건 1회 실행 후에 조건 비교는 두 번째 실행전 실행
 */
package step01.basic;

public class Step04Loop {
	//for
	static void forTest() {
		for(int i = 1; i<= 5 ; i++) {
			// true인 경우 실행되는 문장
			System.out.print(i + "\t");
		}
	}
	
	//while
	static void whileTest() {
		int i = 1; //초기치
		while(i < 6) {//조건식
			System.out.print(i + "\t");
			i++;//증감식
		}
	}
	//do-while
	static void doWhileTest() {
		int i = 1;
		do {
			System.out.print(i+"\t");
			i++;
		}while(i<6);
	}
	
	public static void main(String[] args) {
		forTest();
		System.out.println();
		whileTest();
		System.out.println();
		doWhileTest();
	}

}
