package difference;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Import {
	static String id = "�ֱ�";
	static int age = 25;

	public static void show() {
		System.out.println(id);
		System.out.println(age);
	}

}
