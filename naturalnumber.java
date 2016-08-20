import java.util.Scanner;
public class naturalnumber {
	public static void main(String[] args) {
		int n,i,s=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number:");
		     n=in.nextInt();
            for(i=1;i<=n;i++)
            	s=s+i;
            System.out.println("The sum of number is " + s);

	}

}
