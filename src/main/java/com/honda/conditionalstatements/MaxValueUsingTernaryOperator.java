package com.honda.conditionalstatements;
public class MaxvalueUsingTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;

int res=(a>b)?a:b;
System.out.println(res);

//max value between three numbers

int x=10;
int y=40;
int z=30;

int res1=(x>y)?((x>z)? x:z):((y>z)?y:z);
System.out.println(res1);


	}

}
