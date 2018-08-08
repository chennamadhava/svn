


public class Methods {
         int bonous=100;
	public static void calculateScore(){
		//this method is developed not taking values and not returning values
		boolean gameOver=true;
		int  score=1000;
		int levelCompleted=5;
		int bonous=100;
		
		if(gameOver){
			
			int finalScore=score+levelCompleted*bonous;
			finalScore+=1000;
			System.out.println(finalScore);
		}
	}
	     public static void calculateScoreTwo(boolean gameOver,int score,int levelCompleted,int bonous){
	    	//This method will take values but not return the values
	    int finalScore=score+levelCompleted*bonous;
				finalScore+=1000;
				System.out.println("Your Final Score was:"+finalScore);
			 
	    	 
	     }
	     public static int calculateScoreThree(boolean gameOver,int score,int levelCompleted,int bonous){
	    //This method will take values and return the values
	    	if(gameOver){
	 			
	 			int finalScore=score+levelCompleted*bonous;
	 			finalScore+=1000;
	 			System.out.println(finalScore);
	 			
	 		}
			 return -1;
	    	 
	     }
	     public static int calculateScoreFour(){
	    	 
	    	 boolean gameOver=true;
	 		int  score=1000;
	 		int levelCompleted=5;
	 		int bonous=100;
	 		
	 		if(gameOver){
	 			
	 			int finalScore=score+levelCompleted*bonous;
	 			finalScore+=1000;
	 			System.out.println(finalScore);
	 	
	 		}
	 	  return -1;
	 	}
	 	
	    	 
	     
	     
	     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       calculateScore();
       
       calculateScoreTwo(true, 5000, 5, 500);
       
       calculateScoreThree(true, 1000, 5, 100);
       
       calculateScoreFour();
	}

}
