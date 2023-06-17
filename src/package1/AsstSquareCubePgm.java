package package1;

import java.util.Scanner;

public class AsstSquareCubePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num= new Scanner(System.in);
	    System.out.println("enter a number=");
		int n= num.nextInt();
		
		int square = n*n;
		System.out.println("square: " +square);
		
		int cube = n*n*n;
		System.out.println("cube: " +cube);
		
		
	    int value=n;
	    int power=4;
	    for(int i=1;i<power;i++)
	    {
	    	value= n*value;
	    }
		System.out.println("fourth power: " +value);

		
	}

}

