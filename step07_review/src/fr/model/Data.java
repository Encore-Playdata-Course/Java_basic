package fr.model;

import java.util.ArrayList;

import fr.model.domain.Food;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Data {
	public Food[] getFoods() {
		Food[] f = { new Food("강창구찹쌀진순대", "한", "순대국밥", 94), new Food("송쉐프", "중", "짬뽕", 235),
				new Food("피제리아호키포키", "양", "피자", 1000), new Food("미토요", "일", "돈까스", 571),
				new Food("장꼬방묵은김치찌개전문", "한", "김치찌개", 244), new Food("만다린", "중", "짜장면", 264),
				new Food("에머이남부터미널점", "양", "쌀국수", 404), new Food("스시환", "일", "초밥", 426) };
		return f;
	}

	public ArrayList<String> discheck(String type, Food[] food) {
		ArrayList<String> list = new ArrayList<>();
		

		for (int i = 0; i < food.length; i++) {
			if (food[i].getType().equals(type)) {
				list.add(food[i].toString());
			}
		}

		if (list.size() != 0)
			System.out.print(list.size() + "개의 데이터가 검색되었습니다!\n");
		else
			System.out.print("해당하는 데이터가 없습니다. :(");
		log.info("데이터 갯수: "+ Integer.toString(list.size())+"\n");
		return list;
	}
}