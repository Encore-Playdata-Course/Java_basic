package fr.model;

import fr.model.domain.Food;

public class Data {
	public Food [] getFoods() {
		Food [] f = {new Food("강창구찹쌀진순대", "한", "순대국밥", 94),
				new Food("송쉐프", "중", "짬뽕", 235),
				new Food("피제리아호키포키", "양", "피자", 1000),
				new Food("미토요", "일", "돈까스", 571),
				new Food("장꼬방묵은김치찌개전문", "한", "김치찌개", 244),
				new Food("만다린", "중", "짜장면", 264),
				new Food("에머이남부터미널점", "양", "쌀국수", 404),
				new Food("스시환", "일", "초밥", 426)};
		return f;
	}
	public static String[] discheck(String type, Food[] foods) {	
		String[] reco = new String[foods.length];
		int k;
		k = 0;
		for (int i = 0; i < foods.length; i++) {
			if (foods[i].getType().equals(type)) {
				reco[k] = foods[i].getName();
				k++;
			}
		}
		reco[k] = null;
		return reco;
	}
}