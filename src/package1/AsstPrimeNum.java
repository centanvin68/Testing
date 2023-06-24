package package1;

import java.util.Scanner;

public class AsstPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to check=");
		int n=sc.nextInt();
		
		if(n%2!=0)
		{
			System.out.println("number is prime");
		}else
		{
			System.out.println("not prime");
		}
	}

}
