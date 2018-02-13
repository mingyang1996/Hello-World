
public class E3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000,i,j;
		double sum=1,sum1=1,a = 1;
		while((1.0/a)>0.000001)
		{
			for(i=1;i<n;i++)
			{
				for(j=1;j<=i;j++)
				{
					sum=sum*j;
					a=sum;
				}
			sum1=sum1+1.0/sum;
			sum=1;
			
			
		}
		System.out.printf("%.6f",sum1);
	}

}
}
