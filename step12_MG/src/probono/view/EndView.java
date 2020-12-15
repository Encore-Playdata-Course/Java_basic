/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  RunningEndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/

package probono.view;

import java.util.ArrayList;

import probono.model.dto.TalentDonationProject;

public class EndView {

	// 진행중인 특정 프로젝트 출력
	public static void projectView(TalentDonationProject project) {
		if (project != null) {
			System.out.println(project);
		} else {
			System.out.println("검색하는 프로젝트는 존재하지 않습니다.");
		}
	}

	// 진행중인 모든 프로젝트 출력
	public static void projectListView(ArrayList<TalentDonationProject> allProbonoProject) {
		for (TalentDonationProject project : allProbonoProject) {
			System.out.println(project);
		}
	}

	// 예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}

}
