/* ???
 * ���� ������ ���� �� test
 * ���� : �� ¦���� ���ؼ� �����Ӱ� ������ ����
 * 	(������ �ڱ� �ֵ��� ����)
 * ������ �����ϰ� ¦���� �ҽ� �ϼ��ϱ�
 * ���� ũ�ν��� �˼�
 */
package step02.happy;

import java.util.Scanner;

import food.domain.Food;

public class ValidationCheck {

	public static String[] nameCheck(String type) {
		Food[] f = { new Food("�۽���", "02-525-7771", "�߽�", 0.276), new Food("���ʸ�", "02-588-7721", "�Ͻ�", 0.871) };
		String[] reco = new String[f.length];
		int k;
		k = 0;
		for (int i = 0; i < f.length; i++) {
			if (f[i].getFoodType().equals(type)) {
				reco[k] = f[i].getName();
				k++;
			}
		}
		reco[k] = null;
		return reco;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String[] re = nameCheck(input);
		for (int i = 0; i < re.length; i++) {
			if (re[i] != null) {
				System.out.println(re[i]);
			}
		}
	}

}
