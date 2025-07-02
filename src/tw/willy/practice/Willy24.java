package tw.willy.practice;

public class Willy24 {

	public static void main(String[] args) {
		String name = "Willy威力";
		System.out.println(name);
		String name2 = name.concat("Lin");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name.length());
		String name3 = name.replace('y','Y');
        System.out.println(name3);
        String s1 = new String("Willy");
        String s2 = s1;
        System.out.println(s1==s2);
        s2 = "Willy";
        System.out.println(s1==s2);
	}

}
