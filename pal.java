import java.util.Scanner;


public class pal {
	public static void main(String[] args) {
		String s,r="";
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the String:");
		s=in.nextLine();
	    int c=s.length();
		{
		 	for(int a=c-1;a>=0;a--)
		 		r=r+s.charAt(a);
		 	if(s.equals(r))
		 		System.out.println("The string is palindrom:"+r);
		 	else
		 		System.out.println("The string is not palindrom:"+r);
		}
		
	}
}
