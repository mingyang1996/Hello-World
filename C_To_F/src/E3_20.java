
public class E3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
		for(n=1;n<=1000;n++)

		{
			for(i=1;i<n;i++)
			{
				if(n%i==0)
					sum=sum+i;

			}
			//System.out.printf("%d ",n);
			if(sum==n)
				System.out.printf("%d ",sum);
			sum=0;
			
			
		}
	}

}
