import java.util.Scanner;
public class number5 {
	public static void main(String[] args) {
		char d;
		System.out.print("enter the character:");
		Scanner in=new Scanner(System.in)																						;
		d=in.next().charAt(0);
		if(d>='a'&& d<='z'|| d>='A'&& d<='Z')
			System.out.println("the character is alph:"+d);
		else
			System.out.println("the character is not alph:"+d);
		

	}

}
