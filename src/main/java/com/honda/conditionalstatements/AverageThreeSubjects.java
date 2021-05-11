package com.honda.conditionalstatements;
import java.util.Scanner;

/*. Write a program to print average of three subjects using simple if?
Input : 
a : 80
b : 80
c : 80
Output :
Average is : 80
*/

public class AverageThreeSubjects {

		public void enterInput() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter maths sub");
			int a= sc.nextInt();
			System.out.println("Enter science sub");
			int b= sc.nextInt();
			System.out.println("Enter physics sub");
			int c=sc.nextInt();
			averagePercent(a,b,c);
		}
		
		public int averagePercent(int a1, int b1, int c1) {
			int d=(a1+b1+c1)/3;
			if(d==a1) {
				System.out.println("average marks:"+d);
			}
			return d;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AverageThreeSubjects obj=new AverageThreeSubjects();
			obj.enterInput();
		}

	}
