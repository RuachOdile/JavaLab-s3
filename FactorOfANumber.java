




import java.util.Scanner;
public class FactorOfAGivenNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number whose factors are to be determined");
		Scanner sc =new Scanner (System.in);
		int num= sc.nextInt();
		
		System.out.println("The factors are");
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}


OUTPUT
*************************************
Enter the number whose factors are to be determined
9
The factors are
1 3 9 
