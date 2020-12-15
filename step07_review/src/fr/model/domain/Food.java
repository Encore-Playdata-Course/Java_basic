package fr.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Food {
	public String name;
	public String type;
	public String feature;
	public int distance;

	

	@Override
	public String toString() {
		return "* �����̸� : " + name + "\n* Ÿ�� : " + type + "\n* ����Ÿ�� : " + feature + "\n* �Ÿ� : " + distance + "m\n\n";
	}
}