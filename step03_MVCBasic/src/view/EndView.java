package view;

import model.domain.Book; // ctrl + shift + o �� �ڵ� �ϼ� ���

public class EndView {
	//Book ��ü �޾Ƽ� ��¸� ���
	public void printBook(Book b) {
		System.out.println(b.toString());
	}
	public static void printBooks(Book [] b) {
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
