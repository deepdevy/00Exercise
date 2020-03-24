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
		
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("패스워드 입력 : ");
		String pwd = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("성별 입력 : ");
		char gen = sc.next().charAt(0);
		System.out.print("이메일 입력 : ");
		String eml = sc.next();
		
		m[count] = new Member(id, pwd, name, age, gen, eml);
		count++;
		
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		return;
	}
	
	public void searchId() {
		
		System.out.print("검색할 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getUserId().equals(id)) {
				printOne(m[i]);
				return;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); 
				return;
			}
		}
	}
	
	public void searchName() {
		System.out.print("검색할 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getUserName().equals(name)) {
				printOne(m[i]);
				return;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); 
				return;
			}
		}
	}
	
	public void searchEmail() {
		
		System.out.print("검색할 이메일을 입력하세요 : ");
		String eml = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getEmail().equals(eml)) {
				printOne(m[i]);
				return;
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다."); 
				return;
			}
		}
		
	}
	
	public void updatePwd() {
		
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getUserId().equals(id)) {
				
				System.out.print("변경할 비밀번호를 입력하세요 : ");
				String npwd = sc.next();
				m[i].setUserPwd(npwd);
				System.out.println("패스워드 수정이 완료되었습니다.");
				return;
				
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다."); 
				return;
			}
			
		}
		
	}
	
	public void updateName() {
		
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getUserId().equals(id)) {
				
				System.out.println("변경할 이름을 입력하세요 : ");
				String name = sc.next();
				m[i].setUserName(name);
				System.out.println("이름 수정이 완료되었습니다.");
				break;
				
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다."); 
				return;
			}
		}
		
	}
	
	public void updateEmail() {
		
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			
			if(m[i].getUserId().equals(id)) {
				
				System.out.println("변경할 이메일을 입력하세요 : ");
				String eml = sc.next();
				m[i].setUserName(eml);
				System.out.println("이메일 수정이 완료되었습니다.");
				return;
				
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다."); 
				return;
			}
		}
		
	}
	
	public void deleteOne() {
		
		System.out.print("탈퇴할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < count; i++) {
			if(m[i].getUserId().equals(id)) {
				m[i] = m[i++];
				count -= 1;
				return;
			} else {
				System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
			}
		}
	}
	
	public void deleteAll() {
		
		for(int i = 0; i < m.length; i++) {
			m[i].setAge(0);
			m[i].setEmail("");
			m[i].setGender(' ');
			m[i].setUserId("");
			m[i].setUserName("");
			m[i].setUserPwd("");
			count = 0;
			
		}
		return;
		
	}
	
	public void printAllMember() {
		
		for(int i = 0; i < count; i++) {
			System.out.println("아이디 : " + m[i].getUserId());
			System.out.println("비밀번호 : " + m[i].getUserPwd());
			System.out.println("이름 : " + m[i].getUserName());
			System.out.println("나이 : " + m[i].getAge());
			System.out.println("성별 : " + m[i].getGender());
			System.out.println("이메일 : " + m[i].getEmail());
			System.out.println();
			return;
		}
		
	}
	
	public void printOne(Member m) {
		System.out.println("아이디 : " + m.getUserId());
		System.out.println("비밀번호 : " + m.getUserPwd());
		System.out.println("이름 : " + m.getUserName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("성별 : " + m.getGender());
		System.out.println("이메일 : " + m.getEmail());
		return;
	}
	
	
	
	
	
	
}
