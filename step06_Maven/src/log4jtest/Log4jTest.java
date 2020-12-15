package log4jtest;

import org.apache.log4j.Logger;

public class Log4jTest {
	//log4jtest package 내의 Log4jTest 클래스에 log기록이 가능한 객체 생성
	static Logger logger = Logger.getLogger("log4jtest.log4jTest");
	
	// 사이트 운영 관리자 관점
	// 무효한 id로 접속 시도를 했다를 기록(해커라 간주)
	static void login(String id) {
		if(id.equals("pd")) {
			logger.info("");
			// 유효한 경우 정상 실행되는 로직들...있다 가정
		}else {
			logger.warn("pd가 아닌 사람이 접속 시도 했음" + id);
		}
	}
	
	public static void main(String[] args) {
		login("pd");
		login("test");
	}

}
