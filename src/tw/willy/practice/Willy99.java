package tw.willy.practice;

public class Willy99 {
	public static void main(String[] args) {
		final int ROWS = 10;
		final int COLS = 10;
		final int START = 1;
		
		
		
		
		//--------------
		for(int k=0; k<ROWS; k++) {
			for(int j =1; j<=9; j++) {
				for(int i = START; i < START+COLS; i++) {
					    int newi = i + k*COLS;
						int r = newi*j;
						System.out.printf("%d x %d = %d\t", newi, j, r);
					
				}
				System.out.println();
			}
			System.out.println("---");
		}
		

	}

}
