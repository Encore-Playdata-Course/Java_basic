package step02_review±è¹Î°Ç;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.name = "k5";
		c1.number = 5678;
		c1.color = "Black";
		
		c2.name = "Sonata";
		c2.number = 1234;
		c2.color = "Red";
		
		System.out.print("c1 : ");
		System.out.println(c1.getName() + ' ' + c1.getNumber() + ' ' + c1.getColor());
		System.out.print("c2 : ");
		System.out.println(c2.getName() + ' ' + c2.getNumber() + ' ' + c2.getColor());

		System.out.println();
		System.out.println("change");
		System.out.println();
		
		c1.setName("Sonata");
		c2.setName("K5");
		
		c1.setNumber(1234);
		c2.setNumber(5678);
		
		c1.setColor("Red");
		c2.setColor("Black");
				
		System.out.print("c1 : ");
		System.out.println(c1.getName() + ' ' + c1.getNumber() + ' ' + c1.getColor());
		System.out.print("c2 : ");
		System.out.println(c2.getName() + ' ' + c2.getNumber() + ' ' + c2.getColor());
		

	}

}

//System.out.print("c1 name is ");
//System.out.println(c1.getName());
//System.out.print("c1 number is ");
//System.out.println(c1.getNumber());
//System.out.print("c1 color is ");
//System.out.println(c1.getColor());
//
//System.out.print("c2 name is ");
//System.out.println(c2.getName());
//System.out.print("c2 number is ");
//System.out.println(c2.getNumber());
//System.out.print("c2 color is ");
//System.out.println(c2.getColor());

//System.out.print("c1 name is ");
//System.out.println(c1.getName());
//System.out.print("c1 number is ");
//System.out.println(c1.getNumber());
//System.out.print("c1 color is ");
//System.out.println(c1.getColor());
//
//System.out.print("c2 name is ");
//System.out.println(c2.getName());
//System.out.print("c2 number is ");
//System.out.println(c2.getNumber());
//System.out.print("c2 color is ");
//System.out.println(c2.getColor());