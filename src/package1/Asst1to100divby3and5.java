package package1;

import java.util.Scanner;

public class Asst1to100divby3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
		//Scanner scan= new Scanner(System.in);
		//int n= scan.nextInt();
		
		System.out.println("Divided by 3");
		
		for(int i=1;i<=100;i++)
		{
			int a=i%3;
			if (a==0)
			{
				System.out.print(i+", ");
			}
		}
		System.out.println();
      System.out.println("Divided by 5");
		
		for(int j=1;j<100;j++)
		{
			int b=j%5;
			if (b==0)
			{
				System.out.print(j+", ");
			}
		}
		System.out.println();
	      System.out.println("Divided by 3 and 5");
			
			for(int k=1;k<100;k++)
			{
				int d,c;
				d= k%3;
				c= k%5;
				if((d==0)&&(c==0))
				{
					System.out.print(k+", ");
				}
				//if(((k%3) & (k%5))==0)
				//{
					//System.out.print(k+",");
				//}
			}
		
	}

}
