import java.util.*;
public class SumOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
int n;
int sum=0;
int a;

System.out.println("Enter the number of inputs");
n=s.nextInt();
if(n<=0)
{
	System.out.println("Please enter the natural numbers");
}

else
{
System.out.println("Enter the numbers");
for(int i=1;i<=n;i++)
{
	a=s.nextInt();
	sum=sum+a;
	}
System.out.println("The sum these "+n+" numbers is "+sum);
	}

}
}