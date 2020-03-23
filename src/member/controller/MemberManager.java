package member.controller;

import java.util.Scanner;

import member.model.vo.Member;
import member.view.MemberMenu;

public class MemberManager {
	
	private Member[] m = new Member[10];
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	
	public MemberManager(){}
	
	public void insertMember() {
		
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("패스워드 입력 : ");
		String pwd = sc.next();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("성별 입력 : ");
		char gen = sc.next().charAt(0);
		System.out.println("이메일 입력 : ");
		String eml = sc.next();
		
		m[count] = new Member(id, pwd, name, age, gen, eml);
		count++;
		
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		new MemberMenu().mainMenu();
	}
	
	public void searchId() {
		
		System.out.println("검색할 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getUserId().equals(id)) {
				System.out.println(m[i]);
				return;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); 
				new MemberMenu().mainMenu();
			}
		}
	}
	
	public void searchName() {
		System.out.println("검색할 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getUserName().equals(name)) {
				System.out.println(m[i]);
				return;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); 
				new MemberMenu().mainMenu();
			}
		}
	}
	
	public void searchEmail() {
		
		System.out.println("검색할 이메일을 입력하세요 : ");
		String eml = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getUserName().equals(eml)) {
				System.out.println(m[i]);
				return;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); 
				new MemberMenu().mainMenu();
			}
		}
		
	}
	
	
	
	
	
	
}
