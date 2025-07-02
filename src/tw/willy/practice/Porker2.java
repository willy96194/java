package tw.willy.practice;

public class Porker2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] porker = new int[52];
		
		//洗牌
		for(int i=0; i<porker.length; i++) {
			boolean isReapeat;
			int rand ;
			do {
			rand = (int)(Math.random()*52);
			//檢查是否重複
			isReapeat = false;
			for(int j=0; j<i; j++) {
				if(rand == porker[j]) {
					isReapeat = true;
					break;
				}
			  }
			}while(isReapeat);
				porker[i] = rand ; 
				System.out.println(porker[i]);
			
		}
		System.out.println();
		System.out.println(System.currentTimeMillis() - start);
		//發牌
		
		//攤牌+理牌

	}

}
