package fr.model;

import java.util.ArrayList;

import fr.model.domain.Food;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Data {
	public Food[] getFoods() {
		Food[] f = { new Food("��â������������", "��", "���뱹��", 94), new Food("�۽���", "��", "«��", 235),
				new Food("��������ȣŰ��Ű", "��", "����", 1000), new Food("�����", "��", "���", 571),
				new Food("�岿�湬����ġ�����", "��", "��ġ�", 244), new Food("���ٸ�", "��", "¥���", 264),
				new Food("�����̳����͹̳���", "��", "�ұ���", 404), new Food("����ȯ", "��", "�ʹ�", 426) };
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
			System.out.print(list.size() + "���� �����Ͱ� �˻��Ǿ����ϴ�!\n");
		else
			System.out.print("�ش��ϴ� �����Ͱ� �����ϴ�. :(");
		log.info("������ ����: "+ Integer.toString(list.size())+"\n");
		return list;
	}
}