package view;

import model.Data;

public class StartView {

	public static void main(String[] args) {
		Data d = new Data();
		EndView v = new EndView();
		v.print(d.getFood());

	}

}
