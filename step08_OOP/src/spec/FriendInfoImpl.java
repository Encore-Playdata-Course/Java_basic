//FriendInfo��� interface�� �����ϴ� �ڽ� Ŭ����
package spec;

public class FriendInfoImpl implements FriendInfo{
	
	//������ rule - �������� ������ �޼ҵ� ���𱸸� �����ϰ� �ؼ� ���븸 ����
	public String getInfo(){
		return "��ΰ� : "+COMNAY_NAME;
	}

	public String heart() {
		return "ȭ����";
	}
	//��ü ���� ��� -> ���&���������� ��ü �����ϴ� ���
	public static void main(String[] args) {
		//interface ���� Ÿ���� �ڽ� ��ü ����
		FriendInfo i = new FriendInfoImpl();
		System.out.println(i.getInfo());
		System.out.println(i.heart());
	}

}
