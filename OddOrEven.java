




import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		
		boolean isEven= false;
		if(num%2==0) {
			isEven =true;
		}else {
			isEven =false;
		}
		
		System.out.println("The given number is even = "+isEven);
	}

}

OUTPUT
******************
Enter a number
25
The given number is even = false
