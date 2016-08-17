import java.util.Scanner;
public class number2 {
	public static void main(String[] args) {
		int a;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number a is:");
		a=in.nextInt();
		if(((a>>1)<<1)==a)
			System.out.println("The number is even:"+a);
		else
			System.out.println("The number is odd:"+a);


	}

}
