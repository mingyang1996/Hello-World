import java.io.IOException;
import java.util.Scanner;

public class E3_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x,m=0,n=0,M=0,X=0;
		double N=0,Y=0;
		x=input.nextInt();
		while(x!=0)
		{
			if(x%2==0) {M++;m=m+x;}
			else if(x%2==1||x%2==-1) {X++;n=n+x;}
			x=input.nextInt();		
		}
			if(M!=0)N=m*1.00/M;
			if(X!=0)Y=n*1.00/X;
			System.out.printf("%d %.2f\n",X,Y);
			System.out.printf("%d %.2f",M,N);
		
		
		
		
	}

}
