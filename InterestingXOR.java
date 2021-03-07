
import java.util.Scanner;

class InterestingXOR {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int t= scan.nextInt();
	    long c,a,b;
	    int d;
		while(t-- >0)
		{
			c= scan.nextLong();
			d=(int) (Math.log10(c)/Math.log10(2)  +1) ;
			a= (int)Math.pow(2, d-1)-1;
			b = a^c;
			System.out.println(a*b);
		}

	}

}
