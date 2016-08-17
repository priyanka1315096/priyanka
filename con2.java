import java.util.Scanner;


public class number3 {

	public static void main(String[] args) {
		char d;
		System.out.print("enter the character:");
		Scanner in=new Scanner(System.in)																						;
		d=in.next().charAt(0);
		if(d=='a' |d=='e' |d=='i'|d=='o'|d=='u')
			System.out.println("the character is volwels:"+d);
		else
			System.out.println("the character is consonat:"+d);
		
		

	}

}
