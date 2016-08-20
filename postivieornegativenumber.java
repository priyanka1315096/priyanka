import java.util.Scanner;
public class number6 {
	public static void main(String[] args) {
		int a;
		Scanner in=new Scanner(System.in);
       System.out.print("Enter the number:");
       a=in.nextInt();
       if(a==0)
       {
    	   System.out.println("The number zero is "+a);
       }
       else  if(a>0)
       {
        System.out.println("The number positive is "+a);
       }
       else
       {
    	   System.out.println("The number negative is "+a);
	}
	}
}