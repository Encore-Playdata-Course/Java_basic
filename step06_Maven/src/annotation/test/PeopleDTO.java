package annotation.test;

import lombok.AllArgsConstructor;
import lombok.Data;

//@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@Data // �⺻ ������ + get/setXxx �ڵ� ����

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
