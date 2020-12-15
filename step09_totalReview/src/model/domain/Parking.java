package model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder


public class Parking {
	public String num;
	public int it;
	public String section;
	public String type;
	
	public String toString() {
		return "~~!";
	}
}
