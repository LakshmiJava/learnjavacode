package com.honda.conditionalstatements;

import java.util.Scanner;

public class PrintgivencharacterisvowelConsonent {

	public void enterInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		verifythecharacter(ch);
	}

	public static void verifythecharacter(char ch) {

		switch (ch) {

		case 'a':
		case 'A':
			System.out.println("vowel");
			break;
		case 'e':
		case 'E':
			System.out.println("vowel");
		case 'i':
		case 'I':
			System.out.println("vowel");
		case 'o':
		case 'O':
			System.out.println("vowel");
		case 'u':
		case 'U':
			System.out.println("vowel");
			break;
		default:
			System.out.println("digits");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintgivencharacterisvowelConsonent obj = new PrintgivencharacterisvowelConsonent();
		obj.enterInput();
	}
}
