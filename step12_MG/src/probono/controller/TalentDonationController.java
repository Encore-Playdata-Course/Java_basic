/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  TalentDonationController.java
 * DESC  :  ����ڷ� ���� ���� ��û�� ó���ϴ� Ŭ����
 * 			Model ���� �� View ����
 * 
 * @author  
 * @version 1.0
*/

package probono.controller;

import java.util.ArrayList;

import probono.exception.DuplicateException;
import probono.exception.NotExistException;
import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
import probono.service.TalentDonationProjectService;
import probono.view.EndView;
import probono.view.FailView;

public class TalentDonationController {

	private static TalentDonationController instance = new TalentDonationController();
	private TalentDonationProjectService service = TalentDonationProjectService.getInstance();

	private TalentDonationController() {
	}

	public static TalentDonationController getInstance() {
		return instance;
	}

	ArrayList<TalentDonationProject> projectList = service.getProjectsList();

	/**
	 * ��� ������Ʈ �˻�
	 */
	public void getProjectList() {

		if (projectList.size() != 0) {
			EndView.projectListView(projectList);
		} else {
			EndView.messageView("���� �������� ������Ʈ�� �������� �ʽ��ϴ�.");
		}
	}

	// TO DO
	/**
	 * ������Ʈ �̸����� Ư�� ������Ʈ �˻�
	 * 
	 * @param projectName
	 */
	public void getProject(String projectName) {
		EndView.projectView(service.getProject(projectName));
	}

	// TO DO
	/**
	 * ���ο� ������Ʈ ����
	 * 
	 * @param newProject
	 * @throws DuplicateException
	 */
	public void insertProject(TalentDonationProject newProject) {
		try {
			if (newProject != null) {
				service.projectInsert(newProject);
				EndView.messageView("�߰� ����");
			} else {
				EndView.messageView("���� �����ϰ��� �ϴ� ������Ʈ�� �Է� ������ ��ȿ�մϴ�. ��Ȯ�� �� �ּ���");
			}
		} catch (DuplicateException e) {
			FailView.failMessageView("����ڸ� ������Ʈ �ϰ��� �ϴ� Project�� �� �����ϴ� ������ �߻��߽��ϴ�.");
		}
	}

	/**
	 * �����ϴ� ������Ʈ�� ����� ���� ������Ʈ �̸����� �˻��ؼ� �ش��ϴ� ������Ʈ�� ����� ����
	 * 
	 * @param projectName
	 * @param people
	 */
	public void updateProjectDonator(String projectName, Donator people) {
		if (projectName != null) {
			try {
				service.projectDonatorUpdate(projectName, people);
				EndView.messageView("���� ����");
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("�����ϰ��� �ϴ� ����� ������ ��ȿ�մϴ�, �� Ȯ�� �� �ּ���");
		}
	}

	// TO DO
	/**
	 * �����ϴ� ������Ʈ ������ ���� ������Ʈ �̸����� �˻��ؼ� �ش��ϴ� ������Ʈ�� ������ ����
	 * 
	 * @param projectName
	 * @param people
	 * @throws NotExistException
	 */
	public void updateProjectBeneficiary(String projectName, Beneficiary people) throws NotExistException {
		if (projectName != null && people != null) {
			try {
				service.projectBeneficiaryUpdate(projectName, people);
				EndView.messageView("���� ����");
			} catch (NotExistException e) {
				FailView.failMessageView(e.getMessage());
			}
		} else {
			EndView.messageView("�����ϰ��� �ϴ� ������ ������ ��ȿ�մϴ�, �� Ȯ�� �� �ּ���");
		}

	}

	// TO DO
	/**
	 * ������Ʈ ������ �ش��ϴ� ������Ʈ ����
	 * 
	 * @param projectName
	 * @throws NotExistException
	 */
	public void deleteProject(String projectName) throws NotExistException {
		if (projectName != null) {
			service.projectDelete(projectName);
			EndView.messageView("���� ����");
		} else {
			EndView.messageView("�����ϰ��� �ϴ� ������ ��ȿ�մϴ�, �� Ȯ�� �� �ּ���");

		}

	}
}
