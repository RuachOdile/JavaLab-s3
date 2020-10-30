



import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the number to be checked if palindrome or not");
		Scanner sc =new Scanner (System.in);
		int num =sc.nextInt();
		int temp=num,reversedNumber=0;
		int Length=0;
		Length = (int)Math.log10(num)+1;
		
		
		
		for(int i=1;i<=Length;i++) {
			int lastDigit =temp%10;
			reversedNumber = reversedNumber*10 + lastDigit;
			temp/=10;
		}
		if(reversedNumber==num) {
			System.out.println("The number is a Palindrome number");
		}else {
			System.out.println("The number is not Palindrome");
		}
		
		
		
	}

}

OUTPUT 1
**********************************************
Enter the number to be checked if palindrome or not
121
The number is a Palindrome number




OUTPUT 2
**********************************************
Enter the number to be checked if palindrome or not
654
The number is not Palindrome
  
