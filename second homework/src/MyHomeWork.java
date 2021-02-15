import java.util.Scanner;
public class MyHomeWork {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		

		
		
		
		Scanner input = new Scanner (System.in);
		//function to print three numbers 
		System.out.println("Enter three numbers");
		int a =input.nextInt();
		int b =input.nextInt ();
		double c =input.nextDouble();
		printNumber(a,b,c);

	}
public static double printNumber (int a , int b , double c) { 

System.out.println(a+b+c);
return a+b+c;
}
}