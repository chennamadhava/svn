
public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean gameOver=true;
      int score=1000;
      int levelCompleted=5;
      int bonous=100;
      
      if(score<1000&&score>=1000)
      {
    	  System.out.println("My Score is thousand but not less than thousand");
    	  
      }
      if(score<=1000&&score>=1000)
      {
    	  System.out.println("My Score is thousand but not less than thousand");
    	  System.out.println("If block is executed");
      }
      
      if(score==100||score<=100)
      {
    	  System.out.println("My Score is thousand but not less than thousand");
    	  
      }
      if(score<=1000||score>=1000)
      {
    	  System.out.println("My Score is thousand but not less than thousand");
    	  System.out.println("If block is executed");
      }
      
      if(score<=5000&&score>=5000)
      {
    	  System.out.println("My Score is less than 5000");
    	 
      }else if(score<=1000&&score>=1000){
    	  
    	  System.out.println("My score is less than or equal to 1000");
      }else{
    	  System.out.println("i got here");
      }
      if(gameOver){
    	int  finalscore=score+(levelCompleted*bonous);
    	finalscore+=1000;
    	System.out.println("Your final score is: "+finalscore);
    	
    	
    	//Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well
    	
    	int scoretwo=10000;
    	int levelCompletedTwo=8;
    	int bonousTwo=200;
    	if(gameOver){
    		int finalscoretwo=scoretwo+(levelCompletedTwo*bonousTwo);
    		finalscoretwo+=2000;
    		System.out.println(finalscoretwo);
    		
    		score=50000;//When we write a expression variable we can take duplicate variable
    	/*int*/	levelCompleted=10;//when we write a total statement we cant declare a duplicate local variable
    		bonous=300;
    		if(gameOver){
    			finalscoretwo=score+levelCompleted+bonous;
    			finalscoretwo+=300;
    			System.out.println(finalscoretwo);
    		}
    		
    	}
    	
      }
    
	}

}
