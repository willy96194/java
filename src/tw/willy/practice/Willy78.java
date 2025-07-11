package tw.willy.practice;

import java.sql.Connection;
import java.sql.SQLException;

import tw.willy.api.Member;
import tw.willy.api.MemberDAO;
import tw.willy.api.MemberDAOImpl;
import tw.willy.api.WillyUtil;

public class Willy78 {

	public static void main(String[] args) {
		Connection conn = null;
		try{
			conn = WillyUtil.getConnection();
			conn.setAutoCommit(false);
			MemberDAO dao = new MemberDAOImpl(conn);
			
			Member m1 = dao.findById(1);
			Member m2 = dao.findById(4);
			
			m1.setName("3333");
			dao.updateMember(m1);
			
			System.out.println(10/3);
			
			m2.setName("666");
			dao.updateMember(m2);
			System.out.println("OK");
			
			conn.commit();
			
		}catch(Exception e) {
			System.out.println(e);
			if(conn!=null) {
				try {
					conn.rollback();
					System.out.println("rollback ok");
				} catch (SQLException e1) {
					System.out.println(e1);
				}
				
			}
		}finally {
			if(conn != null) {
				try {
					conn.setAutoCommit(true);
					conn.close();
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
		}

	}

}
