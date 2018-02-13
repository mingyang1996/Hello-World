import java.util.Scanner;

public class E4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int a[]=new int[15];
		int b[]=new int[15];
		int n,j=1;
		for(int i=1;i<=10;i++)
		{
			a[i]=input.nextInt();			
		}
		n=input.nextInt();
		for(int i=1;i<=10;i++)
		{
			if(a[i]!=n)
			{
				b[j++]=a[i];
			}
		}
		j=j-1;
		if(j==10)
			System.out.println("fail!");
		else
		{
			for(int m=1;m<=j;m++)
				System.out.printf("%d ",b[m]);
		
		}
	}

}
