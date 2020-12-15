/*	학습내용
 * 	1. 메소드 구현, 호출 문법 익히기
 * 	2. 다중 클래스들 간에 메소드 호출 문법 익숙해지기
 */
package step01.basic;

public class Customer {
	//멤버 변수
	private String name; // 객체 생성시에 객체의 실제 메모리 내부에 생성 및 구성 
	private int age;
	private String grade; // vvip , vip , silver
	
	//육안으로 보이진 않았으나 자동 생성된 코드
	public Customer(){}
	public Customer(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setNume(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
}
