package tw.willy.practice;

import java.util.ArrayList;
import java.util.LinkedList;

import tw.willy.api.Member;

public class Willy37 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add(0,"Willy1");
		list.add(0,"Willy2");
		list.add(0,"Willy3");
		list.add(0,"Willy4");
		list.add(0,"Willy5");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println("-------");
		
//		Member m1 = new tw.willy.api.Member(1, "Willy");
//		Member m2 = new tw.willy.api.Member(2, "Eric");
//		Member m3 = new tw.willy.api.Member(2, "Tony");
//		Member m4 = new tw.willy.api.Member(1, "Andy");
		
		LinkedList<Member> ms = new LinkedList<Member>();
//		ms.add(m1);
//		ms.add(m2);
//		ms.add(m3);
//		ms.add(m4);
		System.out.println(ms.size());
		System.out.println(ms);

	}

}
