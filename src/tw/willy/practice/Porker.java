package tw.willy.practice;

public class Porker {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] porker = new int[52];
		
		//洗牌
		for(int i=0; i<porker.length; i++) {
			int rand = (int)(Math.random()*52);
			
			//檢查是否重複
			boolean isReapeat = false;
			for(int j=0; j<i; j++) {
				if(rand == porker[j]) {
					isReapeat = true;
					break;
				}
			}
			
			if(!isReapeat) {
				porker[i] = rand ; 
				System.out.println(porker[i]);
			}else {
				i--;
			}
		}
		System.out.println();
		System.out.println(System.currentTimeMillis() - start);
		//發牌
		
		//攤牌+理牌

	}

}
