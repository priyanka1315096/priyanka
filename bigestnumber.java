import java.util.Scanner;
public class nuber5 {
	public static void main(String[] args) {
	 int a,b,c,big=0;
	 Scanner in=new Scanner(System.in);
	 a=in.nextInt();
	 b=in.nextInt();
	 c=in.nextInt();
	 big=(big>a)?big:a;
	 big=(big>b)?big:b;
	 big=(big>c)?big:c;
	 System.out.println("big="+big);
	}

}
