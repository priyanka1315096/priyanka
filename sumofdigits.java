import java.util.Scanner;
public class sumofdigits {
	public static void main(String[] args) {
		int a,b,s=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number:");
           a=in.nextInt();
          while(a!=0)
          {
        	b=a%10;
        	a=a/10;
        	s=s+b;
          }
        	System.out.println("The sum of Digits is " + s);
	}

}
