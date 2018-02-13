import java.util.Scanner;

public class E3_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		int n,i,j;
		n=input.nextInt();
		if(n==1)
		{
			for(i=1;i<=3;i++)
			{
				for(j=1;j<=2*i-1;j++)
					System.out.printf("*");
				System.out.println();
			}
					
		}
		else if (n==2) {
			for(i=3;i>=1;i--)
			{
				for(j=1;j<=2*i-1;j++)
				{
					System.out.printf("*");
				}
				System.out.println();
				
			}	
		}
		else if (n==3)
		{
			for(i=1;i<=3;i++)
			{
				for(j=1;j<=2*i-1;j++)
					System.out.printf("*");
				System.out.println();
			}
			
			for(i=2;i>=1;i--)
			{
				for(j=1;j<=2*i-1;j++)
				{
					System.out.printf("*");
				}
				System.out.println();
				
			}	
			
		}
		else if (n==4)
		{
			for(i=1;i<=3;i++)
			{
				for(j=1;j<=3-i;j++)
					System.out.printf(" ");
				for(j=1;j<=2*i-1;j++)
					System.out.printf("*");
				System.out.println();
			}
			for(i=2;i>=1;i--)
			{
				for(j=1;j<=3-i;j++)
					System.out.printf(" ");
				for(j=1;j<=2*i-1;j++)
					System.out.printf("*");
				System.out.println();
			}
			
		}
		
	}		

}
