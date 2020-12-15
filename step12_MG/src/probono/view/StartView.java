/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  StartView.java
 * DESC  : 실행 클래스
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import probono.controller.TalentDonationController;
import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
import probono.model.dto.TalentDonationType;

public class StartView {
	
	public static void main(String[] args) throws Exception {
		
		TalentDonationController controller = TalentDonationController.getInstance();
		
		System.out.println("\n*** 01. 모든 Project 검색 ***");
		controller.getProjectList();	
		
//		
		System.out.println("\n*** 02. '01슈바이처'라는 이름의 Project 검색 ***");
		controller.getProject("01슈바이처");
//
		System.out.println("\n*** 03. 미존재하는 Project 검색 ***");
		controller.getProject("키다리아저씨---");
//		
//		
		//'04키다리아저씨' 라는 프로젝트 새로 생성해서 저장 및 검색		
		System.out.println("\n*** 04. '04키다리아저씨'라는 새로운 Project저장 후  모든 Project 검색 ***");
		TalentDonationProject newProject = new TalentDonationProject("04키다리아저씨", 
				new Donator(5980, "손다리", "shon@company.com", "키다리아저씨 프로젝트"),
				new Beneficiary(106, "나빈곤", "010-666-6666", "키다리아저씨 프로젝트"), 
				new TalentDonationType("키다리아저씨 프로젝트",  "멘토링, 상담, 교육, 결연 분야", "결연, 상담, 멘토, 독서ㆍ학습지도 및 교육기회 제공, 장학지원, 심리상담 등 멘토링, 상담, 교육, 결연분야"),
				"2020-03-31", "2020-04-03", "학비 지원 및 멘토링");
		System.out.println("\n04-1. 저장 전 프로젝트 검색");
		controller.getProjectList();
		
		controller.insertProject(newProject);
		
		System.out.println("\n04-2. 저장 후 검색");
		controller.getProjectList();
		
		System.out.println("\n04-3. 이미 저장된 프로젝트 재저장 시도후 유효성 검증의 적합성 검증");
		controller.insertProject(newProject);
			
		
		//저장 로직의 유효성 처리 로직 검증
		System.out.println("\n*** 05. 의미없는 데이터인 null로 Project 저장 시도 후 유효성 로직의 적합성 검증 ***");
		controller.insertProject(null);  //?
		
//		
		//존재하는 '04키다리아저씨' 프로젝트의 수혜자 업데이트 및 갱신 내용 검색
		System.out.println("\n*** 06. 존재하는 '04키다리아저씨' Project 수혜자 변경 후 수정한 내용 검색 ***");
		System.out.println("06-1. 수정 전 프로젝트 검색");
		controller.getProject("04키다리아저씨");
		controller.updateProjectBeneficiary("04키다리아저씨", new Beneficiary(110, "맘여리", "010-333-3333", "키다리아저씨 프로젝트"));
		
		
		System.out.println("\n06-2. 수정 후 프로젝트 검색");
		controller.getProject("04키다리아저씨");
//		
//		
		System.out.println("\n*** 07. 의미없는 데이터인 null로 Project의 수혜자 정보 수정 시도 후 유효성 로직의 적합성 검증 ***");
		controller.updateProjectBeneficiary("04키다리아저씨", null);
//		
//
		//'01슈바이처' Project 삭제 후 검색
		System.out.println("\n*** 08. '01슈바이처' Project 삭제 후 삭제한 Project 검색 ***");
		System.out.println("08-1. 삭제전 프로젝트 검색");
		controller.getProject("01슈바이처");
		controller.deleteProject("01슈바이처");
		
		System.out.println("\n08-2. 삭제 후 프로젝트 검색 ");
		controller.getProject("01슈바이처");
		
		
		System.out.println("\n08-3. 삭제된 프로젝트 삭제 재시도 후 유효성 로직의 적합성 검증");
		controller.deleteProject("01슈바이처");
		
	}
}






