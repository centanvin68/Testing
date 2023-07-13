package package1;

public class AsstStarPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pattern1");
		for(int i=1; i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
			System.out.print("*");
		    }
			System.out.println();
		}
		
		System.out.println("Pattern2");
		for(int i=5; i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
			System.out.print(" ");
			}
			for (int k=3;k>=i;k--)
			{
				System.out.println("*");	
			}
			
		}
		
		
		System.out.println("Pattern3");
		for(int i=1; i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print("*");
		    }
			System.out.println();
     	}
			
//		System.out.println("Pattern4");
//		for(int i=1; i<=5;i++)
//		{
//			for(int j=0;j<i;j++)
//			{
//			System.out.print("*");
//		    }
//			System.out.println();
//		}
//		
//		System.out.println("Pattern5");
//		for(int i=1; i<=5;i++)
//		{
//			for(int j=0;j<i;j++)
//			{
//			System.out.print("*");
//		    }
//			System.out.println();
//		}
	}

}
