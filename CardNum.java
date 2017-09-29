package javabasic;

import java.util.Scanner;

public class CardNum {
	String x;
	CardNum(){
    x="XXXXXXXXXXXX";
	}
	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		String s=str.nextLine();
		rePlace(s);
		}
	public static void rePlace(String s){
		int n=s.length();
		String a=s.substring(0,n-4);
		CardNum c= new CardNum();
		String replaced=s.replace(a, c.x);
		System.out.println(replaced);	
	}

}
