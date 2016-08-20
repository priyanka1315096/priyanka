import java.util.Scanner;
public class palindrom {
	public static void main(String[] args) {
	 int a,b,c,s=0;
	 Scanner in=new Scanner(System.in);
	 System.out.print("Enter the number:");
	 a=in.nextInt();
	while(a!=0)
	 {
		 c=a%10;
		 a=a/10;
		 s=s*10+c;
	 }
	   System.out.println("The number is palindrom "+s);
}
}

