import java.util.Scanner;

public class E3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x,sum,temp,fenzi,fenmu,k;
		double flag=-1,i=1,j,a;
		x=input.nextDouble();
		fenzi=x;
		sum=x;
		a=i;
		do {
			fenzi=x;
			for(j=1;j<2*i+1;j++)
			{
				fenzi=x*fenzi;		
			}
			//System.out.printf("%d",fenzi);
			a=i*a;
			fenmu=(2*i+1)*a;
			k=fenzi/fenmu;
			//System.out.printf("%.6f ",k);
			temp=k*flag;
			//System.out.printf("%.6f ",temp);
			sum=sum+temp;
			flag=-flag;
			i++;
		}while(k>1e-6);
		//System.out.printf("%.6f",temp);
		System.out.printf("%.6f",sum);
	}

}
