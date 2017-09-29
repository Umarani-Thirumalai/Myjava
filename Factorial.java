package javabasic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factorial1();
	}
	public static void factorial1(){
		int a,i,j;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(i=1,j=1;i<=a;i++){
			j=j*i;
		}
		System.out.println(j);
	}

}
