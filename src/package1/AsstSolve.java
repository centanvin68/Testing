package package1;

public class AsstSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int i = 10;
		//i = i++;
		//System.out.println(i);

		//int j = 10;
		//j = j++ + j;
		//System.out.println(j);

		int i1 = 10;
		int j = i1++ + ++i1;
		System.out.println(j);

		int i2 = 10;
		int k = ++i2 + ++i2 + ++i2 + i2++;
		System.out.println(k);

		int i3 = 10;
		int m = ++i3 + i3++ + i3++ + i3++  + i3-- + i3-- + --i3;
		System.out.println(m);
	}

}
