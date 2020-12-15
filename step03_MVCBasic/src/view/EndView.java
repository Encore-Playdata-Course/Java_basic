package view;

import model.domain.Book; // ctrl + shift + o 로 자동 완성 기능

public class EndView {
	//Book 객체 받아서 출력만 담당
	public void printBook(Book b) {
		System.out.println(b.toString());
	}
	public static void printBooks(Book [] b) {
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
