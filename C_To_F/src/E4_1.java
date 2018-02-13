import java.util.Scanner;

public class E4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int a[][]=new int[10][10];
		int sum=0,i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
				a[i][j]=input.nextInt();
	
		}
		
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
				if(i==j)
					sum=sum+a[i][j];
		}
		System.out.println(sum);
	}
}