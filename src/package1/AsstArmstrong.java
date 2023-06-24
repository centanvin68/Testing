package package1;

import java.util.Scanner;

public class AsstArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num= sc.nextInt();
		//System.out.println("");
		//int n=sc.nextInt();
		
		int y=0,x,k=num;
		
		
		//for(i=0; i<=num; i++)
		
		while(num>0)
		  {
			x=num%10;
			y= y+(x*x*x);
			num=num/10;
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
