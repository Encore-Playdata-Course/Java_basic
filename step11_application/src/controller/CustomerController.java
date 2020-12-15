/* Client가 1 선택 시 - 모두 고객 정보 검색 요청이라 간주
 * 		   2  선택 시 - 한명의 고객 정보 검색
 * 		   3  선택 시 - 수정
 * 		   4  선택 시 - 삭제
 * 		   5  선택 시 - 저장
 * 
 */
package controller;

import model.CustomerModel;
import model.domain.Customer;
import view.EndView;

public class CustomerController {
	private static CustomerModel cm = new CustomerModel();
	public static void reqProcess(int reqNo) {
		if(reqNo == 1) {
			EndView.viewCustAll(cm.getCustomers());
		}else if(reqNo == 2) {
			Customer cust = cm.getCustomer("민건");
			
			if(cust != null) {
				EndView.viewCust(cust);
			}else {
				EndView.validateReq("해당 고객은 미 존재");
			}
		}else if(reqNo == 3) {
			boolean result = cm.update("민건", "gold");
			
			if(result == true) {
				EndView.validateReq("고객 등급 수정 완료");
			}else {
				EndView.invalidateReq("id가 미 존재하는 고객의 등급을 수정하려 해서 실패");
			}
		}else if(reqNo == 4) {
			int result = cm.delete("민건");
			if(result == 1) {
				EndView.validateReq("고객 삭제 완료");
			}else {
				EndView.validateReq("삭제하려는 고객 id가 없습니다");
			}
		}else if(reqNo == 5) {
			try {
				cm.insert(new Customer("이동욱", 22, "vvip"));
				EndView.validateReq("고객 등록 완료");
			} catch (Exception e) {
				e.printStackTrace(); //개발자 및 서버 관리자만 확인 가능한 메세지
				EndView.invalidateReq("중복 id 재시도 하세요");
			}
		}else {
			EndView.invalidateReq("요청에 부합되는 서비스가 없습니다");
		}
	}
//	public static void main(String[] args) {
//		reqProcess(4);
//	}
}
