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
		System.out.println("한 중 양 일");
		sc = new Scanner(System.in);
		String input = sc.nextLine();
		log.info("입력값: "+ input );		
		eView.printFoods(data.discheck(input, data.getFoods()));
	}
}