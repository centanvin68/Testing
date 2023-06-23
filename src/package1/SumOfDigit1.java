package package1;

public class SumOfDigit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=234, sum=0;
		
		while(a>0)
			{
		int b = a%10;
		sum= sum+b;
		a=a/10;
		   }
	
		System.out.println("sum should be "+sum);
		
	}

}
