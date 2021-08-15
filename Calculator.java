package com.simplilearn.assignment1;

import java.util.Scanner;

public class Calculator {
	
	static double dInput1 = 0.0, dInput2 = 0.0;		//To store integer type results
	static double dResult = 0.0;					//To store floating point type results
	static int nOperation = 0;						//To store desired operation
	
	public static void main(String[] args) {
		int nOperationFlag = 0;							//Operation Valid or InValid
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ADD:1, SUB:2, MULT:3, DIV:4, MOD:5, SQUARE:6, SQRT:7, INV:8");
		System.out.println("Enter the Operation: ");
		nOperation = scanner.nextInt();
		
		do {
			if(nOperation==1 | nOperation==2 | nOperation==3 | nOperation==4 | nOperation==5){
				System.out.println("Enter the First Number: ");
				dInput1 = scanner.nextDouble();
	
				System.out.println("Enter the Second Number: ");
				dInput2 = scanner.nextDouble();
				
				nOperationFlag = 1;
				break;
			}
			else if(nOperation==6 | nOperation==7 |nOperation==8){
				System.out.println("Enter the Number:");
				dInput1 = scanner.nextDouble();
				nOperationFlag = 1;
				break;
			}
			else {
				System.out.println("Enter a valid operation: 1 to 8");
				System.out.println("Enter the Operation: ");
				nOperationFlag = 0;
				continue;
			}
		} while (nOperationFlag == 1);
		
		switch(nOperation) {
		case 1:
			dResult = dInput1 + dInput2;
			System.out.println("Output: "+dResult);
			break;
		case 2:
			dResult = dInput1 - dInput2;
			System.out.println("Output: "+dResult);
			break;
		case 3:
			dResult = dInput1 * dInput2;
			System.out.println("Output: "+dResult);
			break;
		case 4:
			dResult = dInput1 / dInput2;
			System.out.println("Output: "+dResult);
			break;
		case 5:
			dResult = dInput1 % dInput2;
			System.out.println("Output: "+dResult);
			break;
		case 6:
			dResult = dInput1 * dInput1;
			System.out.println("Output: "+dResult);
			break;
		case 7:
			dResult = Math.sqrt(dInput1);
			System.out.println("Output: "+dResult);
			break;
		case 8:
			dResult = 1/dInput1;
			System.out.println("Output: "+dResult);
			break;
		default:
			break;
		}
		System.out.println("Calculation Result: "+dResult);
	}
}
