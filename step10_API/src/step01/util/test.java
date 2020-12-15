package step01.util;
import java.util.ArrayList;

//Q. list.get(6) 객체의 print()메소드를 호출한 결과에 대해 예측하시오.
//Q. print()메소드를 사용하지 않고 같은 결과가 출력되도록 출력문을 작성하시오.

class A{
	int a;
	A(){};
	A(int newa){
		a=newa;
	}
	void print(){
		System.out.println("a:"+a);;
	}
}
class B extends A{
	int b;
	B(){};
	B(int a,int newb){
		super(a);
		b=newb;
	}
	void print(){
		super.print();
		System.out.println("b: "+b);
	}	
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<A> list = new ArrayList<A>();
		
		for(int i=1;i<=10;i++) {
			int temp=3;
			if(i<5)	list.add(new A(temp*i));
			else list.add(new B(i,temp*i));
		}
				
		list.get(6).print();
//		System.out.println("a:"+list.get(6).a+"\nb: "+((B)(list.get(6))).b);
	}

}
