package javabasic;

public class StringRev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="malayalam";
		int flag=0;
		int k=a.length();
		for (int j=k-1,i=0;j>=0;j--,i++){
			if(a.charAt(i)==a.charAt(j)){
				continue;}
				else
					flag=1;
					System.out.println("Not a palindrome");
					break;
			}
		if(flag==0)
		System.out.println("palindrome");
	}
	}

