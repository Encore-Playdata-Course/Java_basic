package View;

import java.util.Scanner;

import fr.model.Data;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class StartView {
	private static Scanner sc;

	public static void main(String[] args) {
		Data data = new Data();
		EndView eView = new EndView();
		System.out.println("�� �� �� ��");
		sc = new Scanner(System.in);
		String input = sc.nextLine();
		log.info("�Է°�: "+ input );		
		eView.printFoods(data.discheck(input, data.getFoods()));
	}
}