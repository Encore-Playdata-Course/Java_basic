package model;
import lombok.Builder;
import model.domain.Parking;
public class Charge extends Parking {
	//���� ����
	public int result;
	//��ü ����
	public Charge(String num, int it, String section, String type, int result) {
		super(num, it, section, type);
		this.result = result;
	}
	
	public Charge cal(Parking p, int ot) {
		// �׷��� � ���� ��� ������??
		Charge c = new Charge(p.num, p.it, p.section, p.type, result);
		int h = (ot / 100 - p.it / 100) * 60;
		int m = ot % 100 - p.it % 100;
		c.result = (h + m) / 10;
		if (p.getType().equals("����")) {
			c.result = (int) (c.result * 1000 * 0.7);
		} else {
			c.result = c.result * 1000;
		}
		return c;
	}
	@Override
	public String toString() {
		return "Charge [result=" + result + ", num=" + num + ", it=" + it + ", section=" + section + ", type=" + type
				+ "]";
	}
}