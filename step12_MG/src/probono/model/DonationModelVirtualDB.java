/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  DonationModelVirtualDB.java
 * DESC  :  재능 기부 프로젝트에 사용될 test data 제공 클래스
 * 
 * @author  
 * @version 1.0
*/
package probono.model;

import java.util.ArrayList;

import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
import probono.model.dto.TalentDonationType;

public class DonationModelVirtualDB {
	private static DonationModelVirtualDB instance = new DonationModelVirtualDB();
	private ArrayList<TalentDonationProject> projectList = new ArrayList<TalentDonationProject>();

	private DonationModelVirtualDB() {
		projectList.add(new TalentDonationProject("01슈바이처", new Donator(7369, "김의사", "kimdoc@company.com", "슈바이처 프로젝트"),
						new Beneficiary(100, "김연약", "010-111-1111", "슈바이처 프로젝트"),
						new TalentDonationType("슈바이처 프로젝트", "의료, 보건, 건강과 관련된 분야", "의사, 한의사, 수의사, 스포츠 마사지, 수지침, 이혈, 발마사지 등 의료 활동이나 의료 활동을 위한 후원, 보건, 의료 활동 보조, 대체의학 요번, 보건위생, 응급 처치등"),
						"2020-03-31", "2020-04-03", "아토피 무상 치료"));

		projectList.add(new TalentDonationProject("02오드리햅번", new Donator(7156, "신예능", "shin@company.com", "오드리햅번 프로젝트"),
						new Beneficiary(101, "박아트", "010-222-2222", "오드리햅번 프로젝트"),
						new TalentDonationType("오드리햅번 프로젝트", "문화, 예술 관련 분야", "예술가, 문화관련 프로그램 제공, 전시ㆍ관람 등 기회제공, 사진, 영상, 디자인, 메이크업, 마술, 모델, 활용 캠페인 등"),
						"2020-03-31", "2020-04-03", "예술가와의 만남"));
		
		projectList.add(new TalentDonationProject("03마더테레사", new Donator(8012, "이레사", "lee@company.com", "마더테레사 프로젝트"),
						new Beneficiary(105, "이건강", "010-555-5555", "마더테레사 프로젝트"), 
						new TalentDonationType("마더테레사 프로젝트", "저소득층 및 사회복지 분야", "사회복지 관련 시설기관 봉사 및 후원, 독거노인 돌봄, 그룸혹, 쉼터 지원등"),
						"2020-03-31", "2020-04-03", "독거 노인 식사 제공"));

	}

	public static DonationModelVirtualDB getInstance() {
		return instance;
	}

	public ArrayList<TalentDonationProject> getProjectList() {
		return projectList;
	}

	public void insertProject(TalentDonationProject newProject) {
		projectList.add(newProject);
	}
}
