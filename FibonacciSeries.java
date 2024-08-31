package FibonacciSeries;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args)
	
	    {
		int i=1,n,FirstTerm=0,SecondTerm=1;
		try (Scanner num = new Scanner(System.in)) {
			System.out.print("Fibonacci Series till  terms: ");
			n=num.nextInt();
		}
		while(i<=n) {
			System.out.print(FirstTerm+",");
			int nextTerm=FirstTerm+SecondTerm;
			FirstTerm=SecondTerm;
			SecondTerm=nextTerm;
			i++;
		}
	
	}

} 



