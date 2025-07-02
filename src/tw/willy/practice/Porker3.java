package tw.willy.practice;

import java.util.Arrays;

public class Porker3 {

	public static void main(String[] args) {
		final int nums = 52;
		int[] porker = new int[nums];
		for(int i=0; i<porker.length; i++)porker[i] = i;
		
		for(int i=nums-1;i>0; i--) {
			int r = (int)(Math.random()*(i+1));
			//porker[r] <=> porker[i]
			int temp = porker[r];
			porker[r] = porker[i];
			porker[i] = temp;
		}
		
		for(int card : porker) {
			System.out.println(card);
		}
		System.out.println("-----");
		
		int[][] players = new int[4][13];
		for(int i=0; i<porker.length; i++) {
			players[i%4][i/4] = porker[i];
		}
		
		String[] flowers = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(int[] player: players) {
			Arrays.sort(player);
			for(int card : player) {
				System.out.print(flowers[card%4] + values[card/4]+ " ");
				
			}
			System.out.println();
		}
	}

}
