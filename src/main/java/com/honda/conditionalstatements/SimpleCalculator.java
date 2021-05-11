package conditionalstatements;
import java.util.Scanner;
public class SimpleCalculator {
	private Scanner sc;

	void enterInput() {
		sc = new Scanner(System.in);
		System.out.println("Enter a input");
		int a = sc.nextInt();
		System.out.println("Enter b input");
		int b = sc.nextInt();
		System.out.println("Enter the operation");
		char op = sc.next().charAt(0);
		System.out.println(calculatorOperation(op, a, b));
//		int result=calculatorOperation(op,a,b);
//		System.out.println(result);
	}

	public int calculatorOperation(char po, int a1, int b1) {
		int res;
		switch (po) {

		case '+':
			res = a1 + b1;
			// System.out.println(res);
			break;

		case '-':
			res = a1 - b1;
			// System.out.println(res);
			break;
		case '*':
			res = a1 * b1;
			// System.out.println(res);
			break;
		default:
			res = a1 % b1;
			// System.out.println(res);
			break;

		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator obj = new SimpleCalculator();
		obj.enterInput();
	}

}
