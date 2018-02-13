
public class E4_2X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [10][10];
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
				if(i==j||j==6-i)
					a[i][j]=1;
		}
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}

}
