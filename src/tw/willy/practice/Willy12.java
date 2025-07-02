package tw.willy.practice;

public class Willy12 {
	public static void main(String[] args) {
		int[] ary;
		ary = new int[7];
		for(int i=0; i<100; i++) {
			double temp = Math.random();
			int dice = (int)(temp*9)+1;
            if(dice >=1 && dice<=9) {
            	ary[dice<=6?dice:dice-3]++;
			}else {
				ary[0]++;
			}
		}
		if(ary[0]==0) {
			for(int i=1; i<ary.length; i++) {
				System.out.printf("%d點出現%d次\n",i,ary[i]);
			}
		}else {
			System.out.println("Error");
		
		}
	}

}
