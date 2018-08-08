
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int result=1+2;
  System.out.println("1+2="+result);
  
  int previousResult=result;
  System.out.println("previousResult value is:"+previousResult);
  
  result=result-1;
  System.out.println(previousResult+"-1="+result);
		
		
  previousResult=result;
  System.out.println("previousResult value is:"+previousResult);
  result=result*10;
  System.out.println(previousResult+"*10="+result);
  
  previousResult=result;
  System.out.println("previousResult value is:"+previousResult);
		result=result/2;
		System.out.println(previousResult+"/2="+result);
		
		previousResult=result;
		System.out.println("previousResult value is:"+previousResult);
		result=result++;
		System.out.println(result);
		result++;
		System.out.println(result);
		result++;
		System.out.println("My result value is:"+result);
		/*result=result-1;
		System.out.println("My result value is:"+result);
		previousResult=result;*/
		/*result=result-1;
		System.out.println("My result value is:"+result);*/
		result--;
		System.out.println("My result value is:"+result);
	}

}
