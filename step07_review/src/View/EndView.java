package View;

import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class EndView {

	public void printFoods(ArrayList<String> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			log.info(arrayList.get(i));
			System.out.println((i + 1) + "번째 데이터\n" + arrayList.get(i));
			
		}
	}
}