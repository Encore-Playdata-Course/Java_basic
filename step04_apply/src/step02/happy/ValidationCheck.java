/* ???
 * 검증 로직을 구현 및 test
 * 주제 : 내 짝꿍을 위해서 자유롭게 본인이 선택
 * 	(도메인 자기 주도로 선정)
 * 문제를 제시하고 짝궁이 소스 완성하기
 * 서로 크로스로 검수
 */
package step02.happy;

import java.util.Scanner;

import food.domain.Food;

public class ValidationCheck {

	public static String[] nameCheck(String type) {
		Food[] f = { new Food("송쉐프", "02-525-7771", "중식", 0.276), new Food("산초메", "02-588-7721", "일식", 0.871) };
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
