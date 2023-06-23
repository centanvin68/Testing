package package1;

public class PrimeNosUnder20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n= 20;
		System.out.println("prime number below " +n);
		for(int i=1; i<=n;i++)
		{
			if(i%2!=0)
//			{
//				System.out.println(i+"is not prime");
//			}
			//else
			{
				System.out.println(i);
			}
		}
		
	}

}
