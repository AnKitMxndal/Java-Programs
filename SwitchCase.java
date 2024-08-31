package Switch;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		int a,b,operators;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a & b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Modulus");
		System.out.println("Enter the value of operator: ");
		operators=sc.nextInt();
		
		switch(operators)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}
		sc.close();
	}

}

