package model;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import model.domain.Parking;

@Slf4j

public class Data {
//	Parking p = new 
	public Parking [] getParkings() {
		Parking [] p = {new Parking("0156", 1210, "A","�մ�" ),
				new Parking("0256", 1220, "B", "�մ�"),
				new Parking("0356", 1230, "A", "����"),
				new Parking("0456", 1240, "B", "�մ�"),
				new Parking("0556", 1250, "A", "�մ�"),
				new Parking("0656", 1300, "B", "����"),
				new Parking("0756", 1310, "A", "�մ�"),
				new Parking("0856", 1320, "B", "�մ�")};
		return p;
	}
	
	public Parking find(String num, Parking [] parking) {
		int i;
		for (i = 0; i < parking.length; i++) {
			if (parking[i].getNum().equals(num)) {
				break;
			}
		}
		Parking p = new Parking(parking[i].num, parking[i].it, parking[i].getSection(), parking[i].getType());
		return p;
	}
}
