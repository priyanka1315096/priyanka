import java.util.Scanner;
public class am {
	public static void main(String[] args) {
	int a,b,c,i=0,s=0,n;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=a;
	while(b!=0)
	{
		c=b%10;
		b=b/10;
		s=s+c*c*c;
	}
	if(a==s)
	{
	System.out.println("the number is armstrong:"+s);
	}
	}

}