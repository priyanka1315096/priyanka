import java.util.Scanner;
public class leaf {
	public static void main(String[] args) {
		int n,a;
		Scanner in=new Scanner(System.in); 
		System.out.print("Enter the year:");
            n=in.nextInt();
        if(n%4==0 || n%400==0)
            System.out.println("The year is leaf year "+n);
   
        else
        	 System.out.println("The year is not leaf year "+n);
	}

}