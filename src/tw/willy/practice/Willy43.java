package tw.willy.practice;

import java.security.GeneralSecurityException;

public class Willy43 {

	public static void main(String[] args) throws GeneralSecurityException {
		Bird b1 = new Bird();
		try {
			b1.setLeg(3);
			
		}catch(GeneralSecurityException e) {
			e.printStackTrace();
		}
		System.out.println("OK");

	}

}
class Bird{
	int leg;
	void setLeg(int n) throws GeneralSecurityException {
		if(n>=0 && n<=2) {
			leg = n;
		}else {
			throw new GeneralSecurityException();
		}
	}
}