package tw.willy.practice;

import tw.willy.api.TWId;

public class Willy25 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(TWId.isRightID("A123456789"));
        System.out.println("------");
        TWId id1 = new TWId();
        TWId id2 = new TWId(false);
        TWId id3 = new TWId('B');
        TWId id4 = new TWId(true,'A');
        System.out.println(id1.getID());
        System.out.println(id2.getID());
        System.out.println(id3.getID());
        System.out.println(id4.getID());
        
//        TWId id5 = TWId.createTWId("A123456787");
//        if(id5 != null) {
//        	System.out.println(id5.getID());
//        }else {
//        	System.out.println("xxxxx");
//        }
        
        TWId id5;
		try {
			id5 = TWId.createTWId("A123456787");
			System.out.println(id5.getID());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
       
	}

}
