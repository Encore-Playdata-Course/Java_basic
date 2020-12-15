package view;

import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;
import model.Charge;
import model.Data;


@Slf4j
public class StartView {

	public static void main(String[] args) {
		Data data = new Data();
		EndView eView = new EndView();
		Charge c = new Charge(null, 0, null, null, 0);
		
		System.out.println("�� ��ȣ�� ���� �ð��� �Է��ϼ���");
		
		Scanner sc = new Scanner(System.in);
		String carNum = sc.nextLine();
		int ot = sc.nextInt();
		
		log.info("�Է°�: "+ carNum + ot);
		
		eView.printAll(c.cal(data.find(carNum, data.getParkings()),ot));	

	}

}
