


 import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		
		// Program to check whether the given number is prime or not
		
		System.out.println("Enter the number ");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		if(num ==0 || num ==1) {
			isPrime =false;
		}
		
		if(num%2==0 & num !=2) {
			 isPrime = false;
			 System.out.println("Not a prime , since the number is even");
			 
			 
		}else for(int i=3;i<10;i++) {
			if(i==num) {
				continue;
		}else {
			if(num%i==0) {
				isPrime =false;
			}
		}
	}
		System.out.println("The number is a prime number="+isPrime);

}
}


OUTPUT
****************************
Enter the number 
5
The number is a prime number=true
