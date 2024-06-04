package com.IPL.Batch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		int num3 = 3;
		
		printDescendingOrder(num1,num2,num3);

	}

	private static void printDescendingOrder(int num1, int num2, int num3) {
		if(num1<num2 && num1<num3) {
			if(num3<num2) {
				num2=num2 + num3;				
				num3=num2 - num3;
			    num2=num2 - num3;
			}
		}
		else if(num2<num1 && num2<num3) {
			num1=num1 + num2;				
			num2=num1 - num2;
		    num1=num1 - num2;
		    if(num3<num2) {
				num2=num2 + num3;				
				num3=num2 - num3;
			    num2=num2 - num3;
			}
			
		}
		else{
			num1=num1 + num3;				
			num3=num1 - num3;
		    num1=num1 - num3;
		    if(num3<num2) {
				num2=num2 + num3;				
				num3=num2 - num3;
			    num2=num2 - num3;
			}
		}
		System.out.printf("Descending Order : %d %d %d",num3,num2,num1);
	}

}
