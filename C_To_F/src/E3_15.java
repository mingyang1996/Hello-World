import java.util.Scanner;

public class E3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n,m,i,j;
		int sum=0,sum1=1;
		n=input.nextInt();
		m=n;
		while(m!=0)
		{
			for(i=1;i<=m;i++)
				sum1=sum1*i;
			sum=sum1+sum;
			sum1=1;
			m--;
		}
		System.out.println(sum);
		
		
		
	}

}
