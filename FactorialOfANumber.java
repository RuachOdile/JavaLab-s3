


import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number whose factorial is to be found out");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		int ans=1;
		
		for(int i=1;i<=num;i++) {
			ans*=i;
		}
		System.out.println("The factorial of the numeber "+num+" is "+ans);

	}

}

OUTPUT
********************************
Enter the number whose factorial is to be found out
5
The factorial of the numeber 5 is 120
