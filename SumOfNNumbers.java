


import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		// sum of first n natural numbers
		int temp=0;
		System.out.println("Program to find the sum of first 'n' Natural numbers");
		System.out.println("Enter the value of 'n'");
		Scanner sc =new Scanner (System.in);
		int num =sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			temp+=i;
		}
		
		System.out.println("The sum of the first "+num+" numbers is "+temp);
	}

}


OUTPUT
****************************************
Program to find the sum of first 'n' Natural numbers
Enter the value of 'n'
12
The sum of the first 12 numbers is 78
