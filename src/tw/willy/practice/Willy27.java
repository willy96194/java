package tw.willy.practice;

public class Willy27 {

	public static void main(String[] args) {
		Willy271 obj1 = new Willy271();
		System.out.println(obj1.i);
		System.out.println(Willy271.j);

		Willy271 obj2 = new Willy271();
		System.out.println(obj2.i);
		System.out.println(Willy271.j);
		
		Willy271 obj3 = new Willy271();
		System.out.println(obj3.i);
		System.out.println(Willy271.j);
		
	}

}
class Willy271 {
	int i ;
	static int j;
	Willy271(){
		i++;
		j++;
	}
}