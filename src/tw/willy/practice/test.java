package tw.willy.practice;

public class test {
	public static void main(String[] args) {
		String[] charactor = {"呱呱, 槍手","龜龜, 刀","sj, 祭司","小白, 法師","標賊, 標","彬彬,劍士" };
	    String[] charactorAOE = {"12, 法師","蚊子, 法師","index, 弓箭"};
	    String[][] team = new String[3][3];
	    
	    for(int i=charactorAOE.length-1;i>0; i--) {
			int r = (int)(Math.random()*(i+1));
			String temp = charactorAOE[r];
			charactorAOE[r] = charactorAOE[i];
			charactorAOE[i] = temp;
		}
	    
	    for(int i=charactor.length-1;i>0; i--) {
			int r = (int)(Math.random()*(i+1));
			String temp = charactor[r];
			charactor[r] = charactor[i];
			charactor[i] = temp;
		}

	    for(int i=0; i<3;i++) {
	    	team[i][0] =charactorAOE[i];
	    	for(int j=1; j<3;j++) {
	    		team[i][j] = charactor[j+(i*2-1)];
	    	}
	    }
	    for(String[] v : team) {
	    	for(String vv : v) {
	    		System.out.println(vv);
	    		
	    	}
	    	System.out.println("------");
	    }
	}

}
