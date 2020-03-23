package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	MemberManager mm = new MemberManager();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		
		do {
			
			System.out.println("========== 회원 관리 메뉴 ==========");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 종료");
			System.out.println("=================================");
			System.out.println("메뉴 번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : new MemberManager().insertMember();
			case 2 : searchMemberMenu();
			case 3 : updateMemberMenu();
			case 4 : deleteMemberMenu();
			case 5 : new MemberManager().printAllMember();
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("번호를 잘못 입력하셨습니다. 다시 선택해주세요."); break;
			}
		}while(true);
	}

}
