package tw.willy.practice;

public class JDBC09 {

	public static void main(String[] args) {
		String passwd = "123456";
		String hashPasswd = BCrypt.hashpw(passwd,BCrypt.gensalt());
		System.out.println(hashPasswd);
		String passwd1 = "1234567";
		if(BCrypt.checkpw(passwd1, hashPasswd)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		

	}

}
