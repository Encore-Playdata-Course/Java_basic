package model;

//model package�� ������ ��� Ŭ������ ���� �ݵ�� import ���� �ʼ�
import model.domain.Book;

public class Data {
	
	public Book getBook() {//Book ��ü�� �޸� �ּ� ���� ����
		//b ������ ������ ��ü�� �ּҰ�, ��ü�� 3���� �����͸� �����ϰ� ����
//		Book b = new Book("001", "java Book", 2020);
//		return b;// �� �ּ� ���� ��ȯ
		
		return new Book("001", "java Book", 2020);
	}
	//??? - �� �� �̻��� å ������ ��ȯ�ϴ� �޼ҵ� ����
	//??? - �� �޼ҵ��� ���� ����� �ܼ�â�� ����
	public Book [] getBooks(){
		Book [] b2 = {new Book("001", "java Book", 2020), new Book("002", "python Book", 2020)};
		return b2;
	}
}
