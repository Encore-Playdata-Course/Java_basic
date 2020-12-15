package model.domain;

public class Book {
	// 멤버 변수들
	String isbn;
	String bookName;
	// 외부에서 호출 불가 즉 접근 제한, 동일한 Book 클래스에서만 호출 가능한 변수
	private int birthDay; // 2020년 이후의 데이터에 한해서 유효

	Book() {
	}

	public Book(String i, String b, int d) {
		isbn = i;
		bookName = b;
		setBirthDay(d);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		if (birthDay >= 2020) {
			this.birthDay = birthDay;
		} else {
			System.out.println("무효한 출판년도");
		}
	}

	// 데이터 사용의 편의성을 위해서 모든 멤버 변수들 값을 한 번에 반환하는 메소드 추가 구현
	// 자바의 반환 타입은 반드시 하나만 가능
	// 문자열로 조합, +(결함연산자)
	public String toString() {
		return isbn + " " + bookName + " " + birthDay;
	}
}
