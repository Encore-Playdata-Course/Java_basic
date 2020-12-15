package model.domain;

public class Book {
	// ��� ������
	String isbn;
	String bookName;
	// �ܺο��� ȣ�� �Ұ� �� ���� ����, ������ Book Ŭ���������� ȣ�� ������ ����
	private int birthDay; // 2020�� ������ �����Ϳ� ���ؼ� ��ȿ

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
			System.out.println("��ȿ�� ���ǳ⵵");
		}
	}

	// ������ ����� ���Ǽ��� ���ؼ� ��� ��� ������ ���� �� ���� ��ȯ�ϴ� �޼ҵ� �߰� ����
	// �ڹ��� ��ȯ Ÿ���� �ݵ�� �ϳ��� ����
	// ���ڿ��� ����, +(���Կ�����)
	public String toString() {
		return isbn + " " + bookName + " " + birthDay;
	}
}
