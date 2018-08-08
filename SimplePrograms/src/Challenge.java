
public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myIntValue=10;
		byte myByteValue=20;
		short myShortValue=30;
		
		long myLongValue=50000l+10*(myIntValue+myByteValue+myShortValue);
		
        System.out.println(myLongValue);
        
        short myShortValueTwo=(short)(10000+10*(myByteValue+myIntValue+myShortValue));
        System.out.println(myShortValueTwo);
        
       
   
	}

}
