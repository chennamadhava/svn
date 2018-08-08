
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int minValue=2147483647;
      
      int maxValue=-2147483648;
      
      int myTotal=minValue/2;
      
      System.out.println(myTotal);
      
      byte myByteValue=-128;
      
    /* byte myTotalByteValue=(myByteValue/2); */ /* error: incompariatable types found:int requried:byte*/
       //to solve above problem we need cating
        
      byte myTotalByteValue=(byte)(myByteValue/2);
      System.out.println(myTotalByteValue);
      
     int myTotalByteValueOne=(myByteValue/2);//it is correct
     
     int myTotalByteValueOn=(myByteValue/2);
     
     long myLongvalue=5555555l;
     int mynewLongValue=(int)(myLongvalue/2);
     System.out.println(mynewLongValue);
     
     short s=5000;
     short s1=(short)(s/2);
     System.out.println(s1);
     
	}

}
