package hello_world;

import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create scanner
		Scanner sc = new Scanner(System.in);
		
		//input
		System.out.println("Enter First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2 = sc.nextInt();
		
		//perform arithmetic
		int sum = num1 + num2;
		int diff = num1 - num2;
		int mul = num1 * num2 ;
		int div = num1/num2;
		int mod = num1 % num2 ;
		
		//print result
		System.out.println("Sum : "+sum);
		System.out.println("Difference : "+diff);
		System.out.println("Mul : "+mul);
		System.out.println("Div : "+div);
		System.out.println("Mod : "+mod);
	}

}
