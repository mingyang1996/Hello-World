import java.util.Scanner;

public class jiujiuchengfa {//改进九九乘法表

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n,i,j;
		n=input.nextInt();
		for(i=0;i<=n;i++)
		{	if(i==0)System.out.printf("   ");
			else System.out.printf("%3d",i);
			
		}
		System.out.println();
		for(i=1;i<=n;i++)
		{	System.out.printf("%3d",i);
			for(j=1;j<=n;j++)
			{
				System.out.printf("%3d",(i)*(j));
			}
			
			System.out.println();
			
			
			
		}
	}

}
