

//Program to calculate the factorial of first 'n' numbers
//*************************************************************************************




import java.util.Scanner;

public class FactorialOfNNumbers {

	public static void main(String[] args) {
		
		System.out.println("Program to calculate the factorial of first 'n' numbers");
		System.out.println("Enter the value of n");
		Scanner sc =new Scanner(System.in);
		
		int num=sc.nextInt();
		int ans=1;
		for(int i=1;i<=num;i++) {
			ans*=i;
			System.out.println("Factorial of "+i+" is ::"+ans);
		}
	}

}

OUTPUT
*******************
Program to calculate the factorial of first 'n' numbers
Enter the value of n
5
Factorial of 1 is ::1
Factorial of 2 is ::2
Factorial of 3 is ::6
Factorial of 4 is ::24
Factorial of 5 is ::120
