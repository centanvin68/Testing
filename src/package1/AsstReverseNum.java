package package1;

import java.util.Scanner;

public class AsstReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to be reversed:");
		int a= sc.nextInt();
		 
		while(a>0)
		{
		int rev= a%10;
		a= a/10;
		System.out.print(rev);
		}
	}

}
//suppose a = 346
//output should be 643