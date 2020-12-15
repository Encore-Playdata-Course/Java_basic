package view;

import lombok.extern.slf4j.Slf4j;
import model.Charge;

@Slf4j
public class EndView {
	public void printAll(Charge charge) {
		System.out.println(charge);
		log.info("주차비용 : " + charge.result);
	}

}
