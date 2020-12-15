/* 학습 내용
 * 1. 기술 문서 참조 후에도 JDK 버전 호환 문제로 인해 정상 실해 불가인 문서 확인
 * 2. 모두 다 안되는 것은 아니고 일부 로직이 메뉴얼과 다르게 실행도 되는 상황이 다수 확인
 * 3. 작업 단계
 * 	json-lib - Map으로 json 쉽게 변환 가능
 * 			 - DTO(Bean) 구조의 객체들 데이터 값이 json 포맷으로 정상 출력은 안되었음
 * 	시도 방식
 * 		최태열씨 gson library 해결
 * 		json-simple library 셋팅 후에 bean을 Map에 담아서 json 포맷의 문자열로 변환해서 출력
 * 			: bean의 toString() 재정의
 * 
 */
package step01.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;


class MyBean {
	private String name = "json";
	private int pojoId = 1;
	private char[] options = new char[] { 'a', 'f' };
	private String func1 = "function(i){ return this.options[i]; }";
	//private JSONFunction func2 = new JSONFunction(new String[] { "i" }, "return this.options[i];");
	@Override
	public String toString() {
		return "MyBean [name=" + name + ", pojoId=" + pojoId + ", options=" + Arrays.toString(options) + ", func1="
				+ func1 + "]";
	}
}	
public class JSONTest {
	public static void main(String[] args) {
		HashMap map2 = new HashMap();
		map2.put("p1", new MyBean());
		//json simple의 lib 특징 : map내의 모든 객체들의 toString() 값들을 json 포멧으로 변환해서 반환
		String jsonObject = JSONObject.toJSONString(map2);
				
		System.out.println(jsonObject); // {"p1":step01.util.MyBean@4554617c}

		System.out.println(" ------------------ ");

//		Map map = new HashMap();
//
//		map.put("name", "json");
//		map.put("bool", Boolean.TRUE);
//		map.put("int", new Integer(1));
//		map.put("arr", new String[] { "a", "b" });
//		map.put("func", "function(i){ return this.arr[i]; }");
//
//		jsonObject = JSONObject.fromObject(map);
//		System.out.println(jsonObject);
		// {"arr":["a","b"],"bool":true,"func":function(i){ return this.arr[i];
		// },"name":"json","int":1}

	}

}