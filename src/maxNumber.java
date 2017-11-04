import java.util.Scanner;

public class maxNumber {

	public static void main(String[] args) {
 
	 
		System.out.println("Print the highest among given 3 numbers\n");
		
		// Taking the 1st number as input
		System.out.println("Please input the 1st number:  ");
		Scanner input1 = new Scanner(System.in);
		int a = input1.nextInt();
		
		// Taking the 2nd number as input
		System.out.println("Please input the 2nd number:  ");
		Scanner input2 = new Scanner(System.in);
		int b = input2.nextInt();
		
		// Taking the 3rd number as input
		System.out.println("Please input the 3rd number:  ");
		Scanner input3 = new Scanner(System.in);
		int c = input3.nextInt();
			
		
	
		// Evaluating the highest number using if-else
		System.out.println("Evaluating the highest number using if-else");
		if (a>b)
		{
			if(a>c)
			{
				System.out.println("The highest number is: " + a);
			}
			else
			{
				System.out.println("The highest number is: " + c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("The highest number is: " + b);
			}
			else
			{
				System.out.println("The highest number is: " + c);
			}
		}
		
		
	// Evaluating the highest number using ternary operator
	System.out.println("The highest number using ternary operator is: " + ((c>((a>b)?a:b))?c:((a>b)?a:b)));

	
	}

}
