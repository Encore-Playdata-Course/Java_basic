package annotation.test;

import lombok.AllArgsConstructor;
import lombok.Data;

//@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@Data // 기본 생성자 + get/setXxx 자동 생성

public class PeopleDTO {
	
	private String id;
	private int pw;
	
	//public PeopleDTO() {} //@NoArgsConstructor

	//@AllArgsConstructor
//	private PeopleDTO(String id, int pw) {
//		super();
//		this.id = id;
//		this.pw = pw;
//	}
	
	
	
	
	
}
