/* 학습내용
 * 1. properties 파일의 내용을 자바 코드로 사용하는 기술 학습
 * 2. 개발 단계
 *  1. Properties 객체 생성
 *  	- properties 파일의 내용을 활용 할 수 있는 기능 보유
 *  2. properties 파일의 내용을 자바 코드로 read해서 사용 가능하게 메모리에 저장(로딩)
 *  	- properties 파일의 내용을 Properties 객체가 사용 가능하게 인지
 *  3. key로 value값 선별해서 활용
 */
package step01.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties pro = new Properties();
		//properties 파일의 내용을 Properties에게 매핑해서 로딩
		/* 파일 읽기
		 *  - 파일의 내용을 read 할 수 있는 API
		 *  - File로 부터 read(input) - FileInputStream
		 * 읽어들인 파일 내용을 Properties에 저장(로딩)하기
		 */
		try {
			pro.load(new FileInputStream("info.properties"));
			System.out.println(pro);//{address=seoul, age=10, name=kim}
			System.out.println(pro.get("age"));//10
			System.out.println(pro.getProperty("age"));//get() 보다 선호
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
