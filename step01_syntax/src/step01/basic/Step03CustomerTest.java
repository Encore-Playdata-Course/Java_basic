package step01.basic;

public class Step03CustomerTest {

	public static void main(String[] args) {
		// 실제 사용 가능하게 메모리에 생성 : 객체 생성
		Customer c1 = new Customer(); // name, age, grade
		
		/*	Customer c2 = new Customer();
		 * 	Customer - Customer라는 클래스가 존재하기 때문에 타입으로 선언
		 * 	c2 - 해당 데이터(객체)를 관리하는 변수
		 *  = 대입연산자
		 *  new - 자바 스펙에서 객체 생성시 상ㅇ되는 중요한 키워드
		 *  Customer() - 이 형태가 존재하기 때문에 호출
		 *			   - 생성자
		 *			   - 클래스 개발 시에 개발자가 코딩하지 않아도 자동으로 생성  		 
		 */
		Customer c2 = new Customer();
		
		// 나이 값을 저장
		//c1.age = 10;
		// 저장된 나이 값 확인
		//int age = c1.age;
		//System.out.println(age);
		// 나이 값 수정
		c1.setAge(11); // int age3 = c1.setAge(11); 는 불가, 반환 값이 없기 때문에
		// 저장된 나이 값 확인
		System.out.println(c1.getAge()); // c1.age
	}

}
