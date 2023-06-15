package package1;

import java.util.Scanner;

public class AsstSumDiffPdtAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that accepts two integers 
		//from the user and then prints the sum,
		//the difference, the product, the average, 
		//the distance (the difference between integer), 
		//the maximum (the larger of the two integers), 
		//the minimum (smaller of the two integers).
		
		Scanner num1= new Scanner(System.in);
		System.out.println(" enter first number=");
		int a = num1.nextInt();
		System.out.println(" enter second number=");
		int b = num1.nextInt();
		
		System.out.println("sum="+(a+b));
		System.out.println("difference="+(a-b));
		System.out.println("product="+(a*b));
		System.out.println("average="+(a+b)/2);
		System.out.println("distance="+(b-a));
		
		if(a>b)
		{
			System.out.println(a+ "is the maximum");
			System.out.println(b+ "is the minimum");
		}
		else
		{
			System.out.println(b+ "is the maximum");
			System.out.println(a+ "is the minimum");
		}
	}

}
