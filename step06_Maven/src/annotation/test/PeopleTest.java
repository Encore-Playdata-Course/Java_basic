package annotation.test;

public class PeopleTest {
	

	public static void main(String[] args) {
		PeopleDTO p1 = new PeopleDTO(null, 0);
		p1.setId("tester");
		System.out.println(p1.getId());
	}
}