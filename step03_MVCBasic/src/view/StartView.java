package view;

import model.Data;

public class StartView {

	public static void main(String[] args) {
		Data data = new Data(); //getBook() ȣ���� ���� ��ü ����		
		EndView view = new EndView(); // printBook() ȣ���� ���� ��ü ����
		view.printBook(data.getBook());
		//EndView.printBooks(data.getBooks());
	}

}
