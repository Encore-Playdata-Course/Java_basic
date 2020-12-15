package model;

//model package를 제외한 모든 클래스들 사용시 반드시 import 문장 필수
import model.domain.Book;

public class Data {
	
	public Book getBook() {//Book 객체의 메모리 주소 값을 제공
		//b 변수는 생성된 객체의 주소값, 객체는 3개의 데이터를 보유하고 있음
//		Book b = new Book("001", "java Book", 2020);
//		return b;// 이 주소 값을 반환
		
		return new Book("001", "java Book", 2020);
	}
	//??? - 두 개 이상의 책 정보를 반환하는 메소드 구현
	//??? - 이 메소드의 실행 결과는 콘솔창에 구현
	public Book [] getBooks(){
		Book [] b2 = {new Book("001", "java Book", 2020), new Book("002", "python Book", 2020)};
		return b2;
	}
}
