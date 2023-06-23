package package1;

public class AsstFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n1=1, n2=1, s=0;
    System.out.print(n1+" ");
    System.out.print(n2+" ");
    
    for(int i=0;i<=6;i++)
    {
    s= n1+n2;
    n1=n2;
    n2=s;
    System.out.print(s+ " ");
	}
}
}
//1 1 2 3 5 8 13 21 34 ..