package tw.willy.practice;

import java.util.HashSet;

import tw.willy.api.Member;

public class Willy36 {

	public static void main(String[] args) {
		Member m1 = new tw.willy.api.Member(1, "Willy");
		Member m2 = new tw.willy.api.Member(2, "Eric");
		Member m3 = new tw.willy.api.Member(2, "Tony");
		Member m4 = new tw.willy.api.Member(1, "Andy");
		
		HashSet<Member> members = new HashSet<>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		members.add(m4);
		
		System.out.println(members.size());
		System.out.println(members);

	}

}
