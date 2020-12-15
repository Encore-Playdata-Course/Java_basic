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
		return "* 가게이름 : " + name + "\n* 타입 : " + type + "\n* 세부타입 : " + feature + "\n* 거리 : " + distance + "m\n\n";
	}
}