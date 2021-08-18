package com.simplilearn.assignment1;

import java.util.Scanner;

public class Calculator {
	
	static double dInput1 = 0.0, dInput2 = 0.0;			//To store integer type results
	static double dResult = 0.0;						//To store floating point type results
	static int nOperation = 0;							//To store desired operation
	static int nCalculation = 0;						//Flag to continue the calculation in a loop
	double dValue = 0.0;								//For returning arithmetic calculation result from method
	
	double arithmetic(int nOpn, double dValue1,double dValue2){	//Arithmetic Calculation to find the result
		switch(nOpn) {							
		case 1:
			dValue = dValue1 + dValue2;
			break;
		case 2:
			dValue = dValue1 - dValue2;
			break;
		case 3:
			dValue = dValue1 * dValue2;
			break;
		case 4:
			dValue = dValue1 / dValue2;
			break;
		case 5:
			dValue = dValue1 % dValue2;
			break;
		case 6:
			dValue = dValue1 * dValue1;
			break;
		case 7:
			dValue = Math.sqrt(dValue1);
			break;
		case 8:
			dValue = 1/dValue1;
			break;
		case 0:
			System.out.println("Application Exits Because Of Error....");
			break;
		default:
			break;
		}
		return dValue;
	}

	public static void main(String[] args) {
		Calculator objCalc = new Calculator();			//Calculator Object Created
		int nOperationFlag = 0;							//Operation Valid or InValid

		Scanner scanner = new Scanner(System.in);
		do {		
			System.out.println("ADD:1, SUB:2, MULT:3, DIV:4, MOD:5, SQUARE:6, SQRT:7, INV:8");
			System.out.println("Enter the Operation: ");
			nOperation = scanner.nextInt();
			
			do {
				if(nOperation==1 | nOperation==2 | nOperation==3){
					System.out.println("Enter the First Number: ");
					dInput1 = scanner.nextDouble();
		
					System.out.println("Enter the Second Number: ");
					dInput2 = scanner.nextDouble();
					
					nOperationFlag = 1;
					break;
				}
				if(nOperation==4 | nOperation==5) {
					System.out.println("Enter the First Number: ");
					dInput1 = scanner.nextDouble();
		
					System.out.println("Enter the Second Number: ");
					dInput2 = scanner.nextDouble();
					
					if(dInput2 == 0) {					//Exception Handling Code for Division by Zero
						System.out.println("Division By Zero is not allowed..Enter a non zero number");
						System.out.println("Enter the Second Number: ");
						dInput2 = scanner.nextDouble();
						if(dInput2 == 0) {
							System.out.println("Multiple try for Division By Zero... Exiiting the Application");
							nOperation = 0;
						}
					}
					
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
					nOperationFlag = 0;
					System.out.println("Enter a valid operation: 1 to 8");
					System.out.println("Enter the Operation: ");
					nOperation = scanner.nextInt();
				}
			} while (nOperationFlag == 0);
			
			dResult = objCalc.arithmetic(nOperation,dInput1,dInput2);				
			
			if(nOperation>=1 && nOperation<=8) {
				System.out.println("Calculation Result: "+dResult);			
			}
			System.out.println("Do you want to do next calculation: YES - 1 & NO - 0");
			nCalculation = scanner.nextInt();
		}while(nCalculation == 1);
	}
}
