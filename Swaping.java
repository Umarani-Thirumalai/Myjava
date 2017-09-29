package javabasic;

import java.util.Scanner;

public class Swaping {
	public static void main(String []args){
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size=s.nextInt();
	int array[]=new int[size];
	System.out.println("Enter the array elements:");
	for(int i=0;i<size;i++){
		array[i]=s.nextInt();
	}
	Swaping a=new Swaping();
	a.sorting(array,size);
for(int i=0;i<size;i++){
	System.out.print(array[i]+" ");
}
}

	
void sorting(int array[],int size){
		int temp;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(array[i]<=array[j]){
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
			}
	}
	}
}
