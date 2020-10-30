



import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements to be printed in the fibonacci series");
		Scanner sc =new Scanner (System.in);
		int a=0,b=1,c;
				
		int num =sc.nextInt();
		if(num==1) {
			System.out.println("series is : 0");
		}else if(num==2) {
			System.out.println("series is : 0 1");
		}else {
			System.out.print("series is :: 0 1 ");
			for(int i=0;i<num-2;i++) {
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
		}
		
	}

	}
}

OUTPUT
*********************************
Enter the number of elements to be printed in the fibonacci series
8
series is :: 0 1 1 2 3 5 8 13 
