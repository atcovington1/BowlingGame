package ssa;

public class SimulatedBowling {
	 static java.util.Random rnd = new java.util.Random((new java.util.Date()).getTime());
	 
	 int scores[][] = new int[3][10];
		
	public int rollOneBall() {
		 
			return  rnd.nextInt(11);
		}
	public int bowlOneFrame(){
		
	int firstBall = rollOneBall();
		int secondBall = 0;
			if(firstBall < 10)
			secondBall = rollOneBall();
		
		int total = firstBall +secondBall;
				if(total > 10) 
			return 10;
		else 
			return total;	
	}

	public void bowl() {
		
		for(int game = 0; game < 3; game ++) {
			for(int frames = 0; frames <10; frames ++)
				scores[game][frames] = bowlOneFrame();
			}
}

public void print(){
	
	int totalScore = 0;
	
	//int oneGameTotal=0;
	System.out.print("Frame==> \t");
	for (int i = 1; i < 11	; i++)
		 {
		System.out.printf("%5d \t", i);
		
	}
	System.out.println(" Total");
	
   //  System.out.println();
	int seriesTotal = 0;
	for(int game=0; game<3; game++){
		totalScore = 0;
		System.out.printf("Game %2d \t" , game+1 );
		
		for (int frames = 0; frames < 10; frames++) {
		
			System.out.printf( "%5d \t", scores[game][frames]);
			
			totalScore = totalScore + scores[game][frames];
			
		}
		// print total column
		System.out.println("    " +totalScore);
	
		seriesTotal += totalScore;
	}
	System.out.println("Series Total:  " + seriesTotal);
}
}
