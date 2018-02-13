import java.util.Scanner;

public class E3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int m,x,i=0,j,n=0;
		m=input.nextInt();
		int []a = new int[10];
		x=m;
		while(m!=0)
		{
			a[i]=m%10;
			m=m/10;
			i++;
		}
		i=i-1;
		for(j=0;j<=i;j++)
		{
			n=a[j]+n*10;
				
		}
		//System.out.println(n);
		if(n==x)
			System.out.println("Y");
		else
			System.out.println("N");
		
	}

}
