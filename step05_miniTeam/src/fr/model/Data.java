package fr.model;

import fr.model.domain.Food;

public class Data {
	public Food [] getFoods() {
		Food [] f = {new Food("��â������������", "��", "���뱹��", 94),
				new Food("�۽���", "��", "«��", 235),
				new Food("��������ȣŰ��Ű", "��", "����", 1000),
				new Food("�����", "��", "���", 571),
				new Food("�岿�湬����ġ�����", "��", "��ġ�", 244),
				new Food("���ٸ�", "��", "¥���", 264),
				new Food("�����̳����͹̳���", "��", "�ұ���", 404),
				new Food("����ȯ", "��", "�ʹ�", 426)};
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