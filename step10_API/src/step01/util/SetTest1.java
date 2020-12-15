/* 학습내용
 * 1. 중복불허, 저장 순서 미보장 데이터 관리 포멧
 * 2. 예시 - 주번만 저장, 학번만 저장..시 사용되는 구조
 * 		   Map의 key 타입으로 사용
 * 3. 정리
 * 		- index, key 개념이 미 적용
 * 4. 개별 데이터값을 어떻게 하나씩 하나씩 뽑아서 사용
 * 		- 순차적으로 데이터를 사용가능하게 열거(Iterator)
 * 5. Iterator
 * 		Object next() - 존재한다는 가정하게 데이터 반환
 * 		boolean hasNext() - 데이터 존재 여부 확인
 */

package step01.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");  //String객체 저장시 String타입으로 유지되면서 저장
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		System.out.println(set);//[a, b, c, d]
		Iterator<String> all = set.iterator();
		while(all.hasNext()) {
			String v = all.next();      
			System.out.println(v);			
		}

		Set set2 = new HashSet<>();
		set.add("a"); //String객체 저장시 Object 타입으로 변환되어 저장
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		System.out.println(set);//[a, b, c, d]
		Iterator all2 = set.iterator();
		while(all.hasNext()) {
			String v2 = (String)all2.next();   
			System.out.println(v2);			
		}
	}

}