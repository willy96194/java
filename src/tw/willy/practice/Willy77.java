package tw.willy.practice;

import java.sql.Connection;
import java.util.List;

import tw.willy.api.Member;
import tw.willy.api.MemberDAO;
import tw.willy.api.MemberDAOImpl;
import tw.willy.api.WillyUtil;

public class Willy77 {

	public static void main(String[] args) {
		try(Connection conn = WillyUtil.getConnection()){
			MemberDAO dao = new MemberDAOImpl(conn);
			
//			Member member = new Member();
//			member.setAccount("tony");
//			member.setPasswd("123456");
//			member.setName("Tony");
//			dao.addMember(member);
//			
//			System.out.println("OK");
			
			
			
//			Member member = dao.findById();
//			member.setName("I am NO2");
//			dao.updateMember(member);
//			System.out.println("OK");
//			
//			List<Member> list = dao.findAll();
//			for(Member m : list) {
//				System.out.println(m.getName());
//			}
//			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
