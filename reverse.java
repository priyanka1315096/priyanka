import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
  String s,r="";
  Scanner in=new Scanner(System.in);
  System.out.print("Enter the string:");
  s=in.nextLine();
  int c=s.length();
  for(int i=c-1;i>0;i--)
	  r=r+s.charAt(i);
  System.out.print("Reverse the string is "+r);
  
	}

}
