import java.util.Scanner;
public class even {
	public static void main(String[] args) {
		 int a,b;
		 Scanner in=new Scanner(System.in);
		 a=in.nextInt();
	     b=in.nextInt();
			 System.out.println("odd numbers are:" );
			 for( int i=a;i<b;i++)
			 {
				 if(i%2==0)
				 System.out.println(i);
		
			 }
	}

}
