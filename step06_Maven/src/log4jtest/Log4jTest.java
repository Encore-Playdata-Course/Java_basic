package log4jtest;

import org.apache.log4j.Logger;

public class Log4jTest {
	//log4jtest package ���� Log4jTest Ŭ������ log����� ������ ��ü ����
	static Logger logger = Logger.getLogger("log4jtest.log4jTest");
	
	// ����Ʈ � ������ ����
	// ��ȿ�� id�� ���� �õ��� �ߴٸ� ���(��Ŀ�� ����)
	static void login(String id) {
		if(id.equals("pd")) {
			logger.info("");
			// ��ȿ�� ��� ���� ����Ǵ� ������...�ִ� ����
		}else {
			logger.warn("pd�� �ƴ� ����� ���� �õ� ����" + id);
		}
	}
	
	public static void main(String[] args) {
		login("pd");
		login("test");
	}

}
