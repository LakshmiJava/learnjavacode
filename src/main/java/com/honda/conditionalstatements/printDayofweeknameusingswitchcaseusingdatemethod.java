package com.honda.conditionalstatements;
import java.util.Scanner;
public class printDayofweeknameusingswitchcaseusingdatemethod {

	public static void enterInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day number");
		int num=sc.nextInt();
		printDay(num);
	}
	public static void printDay(int num) {
		switch(num) {

		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("wedday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("invalid number");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDayofweeknameusingswitchcaseusingdatemethod.enterInput();

	
	

	}

}
