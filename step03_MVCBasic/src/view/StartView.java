package view;

import model.Data;

public class StartView {

	public static void main(String[] args) {
		Data data = new Data(); //getBook() 호출을 위한 객체 생성		
		EndView view = new EndView(); // printBook() 호출을 위한 객체 생성
		view.printBook(data.getBook());
		//EndView.printBooks(data.getBooks());
	}

}
