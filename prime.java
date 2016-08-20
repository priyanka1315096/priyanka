import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
	int a;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the number:");
	a=in.nextInt();
	 if(a/1!=0 ||a/a!=0)
		 System.out.println("The number is prime "+ a);
	 else
		 System.out.println("The number is not prime"+ a);
	}

}
