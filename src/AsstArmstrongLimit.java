import java.util.Scanner;

public class AsstArmstrongLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit:");
		int limit= sc.nextInt();
		//System.out.println("");
		//int n=sc.nextInt();
		
		int y=0,x;
		int k=0;
		
		for(int i=0; i<=limit; i++)
		  {
			for(int j=i;j<=i;j++)
			{
			k=j;
			x=j%10;
			y= y+(x*x*x);
			j=j/10;
			}
        System.out.println("sum of cubes of digits=" +y);
 
		if(y==k)
		{
	      System.out.println("Armstrong number:"+y);
	    }
		else
		{
			System.out.println("not armstrong");
	     }
	   }
	}

}
