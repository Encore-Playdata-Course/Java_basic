package step01.basic;

public class Step05ReferenceArray {
	//Customer 배열 생성해서 데이터 저장
	static Customer [] getCs(){
		Customer [] all = {new Customer("김민건", 26, "v"),
						new Customer("권오민", 26, "v")};
		return all;
	}
	//Customer 배열의 데이터를 반복문 활용해서 출력
	/* all[i].getName()
	 * all - Customer[]
	 * all[0] or all[1] - Customer
	 * all[0].getName() - String 이름값
	 */
	static void printAll(Customer [] all) {
		for(int i=0 ;i < all.length;i++) {
			System.out.println(all[i].getName());
		}
	}
	public static void main(String[] args) {
		Customer [] c = getCs();
		printAll(c);
	}

}
