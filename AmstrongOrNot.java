



import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		
		System.out.println("Enter the number ::");
		Scanner sc =new Scanner (System.in);
		int num= sc.nextInt();
		int numberOfDigits = (int)Math.log10(num)+1;
		int temp=0;
		int temporary=num;
		
		for(int i=1;i<=numberOfDigits;i++) {
			temp+=(temporary%10)*(temporary%10)*(temporary%10);
			temporary=temporary/10;
		}
		
		if (temp==num) {
			System.out.println("Number is an amstrong !.");
		}else {
			System.out.println("The number is not an amstrong !.");
		}
	}

}


OUTPUT-1
****************************************
Enter the number ::
153
Number is an amstrong !.

OUTPUT-2
****************************************
Enter the number ::
5468
The number is not an amstrong !.

