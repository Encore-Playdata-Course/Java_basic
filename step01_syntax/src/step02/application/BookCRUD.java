package step02.application;

public class BookCRUD {
	Book book; //모든 메소드에서 공유하는 자원
	//저장
	/*	호출자(사용자) 관점
	 * 	- 저장 메소드 호출시마다 새로운 데이터로 책 저장
	 * 		: save(String isbn, String name, int birthDay)
	 * 	- 메소드 body에 이미 정해진 데이터로 Book을 만들 것 인지
	 * 		: save(){..}
	 */
	void save(String isbn, String name, int birthDay) {
		book = new Book(isbn, name, birthDay);
	}
	
	//검색
	void search() {
		//book.toString()
		/*	book 변수가 관리하는 주소 값의 객체가 보유한 toStirng() 호출함을 의미
		 * 	book이 관리하는 객체가 있을 경우 - 실행
		 * 			"		 없을 경우 - 없는데 호출했다 큰일났다
		 */
		System.out.println(book.toString());
	}
	
	//수정 
	void update(String newName) {
		book.setBookName(newName);
	}
	//삭제
	void delete() {
		book = null; //주소 값을 초기화하는 키워드, 즉 참조 타입 변수들 기본값
	}
	public static void main(String[] args) {
		BookCRUD crud = new BookCRUD();
		//? CRUD 나름 순서대로 호출하셔서 결과값 확인 하기
		//데이터 생성->확인(검색)->수정->확인(검색)->삭제->확인(검색)
		crud.save("등록", "확인", 20201104);
		crud.search();
		crud.update("change");
		crud.search();
		crud.delete();
		crud.search();

	}

}
