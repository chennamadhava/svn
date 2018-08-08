
public class ChallengrTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int myIntValue=100;
  byte myByteValue=20;
  short myShortValue=200;
  long myLongValue=3000000000000000000l;
  System.out.println(myLongValue);
  
  long b=(short)(1000+10+(myByteValue+myIntValue+myLongValue+myShortValue));
  
	System.out.println(b);	
	
	long bone=(long)(1000+10+(myByteValue+myIntValue+myLongValue+myShortValue));
	  
	System.out.println(bone);
	
	long btwo=(int)(1000+10+(myByteValue+myIntValue+myLongValue+myShortValue));
	  
	System.out.println(btwo);
	
	long bthree=(byte)(1000+10+(myByteValue+myIntValue+myLongValue+myShortValue));
	  
	System.out.println(bthree);
		
	}
}