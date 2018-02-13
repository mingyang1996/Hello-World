
public class E4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int a[]=new int[15];
		int b[]=new int[15];
		int i=0,m,j=1,q;
		for(n=10;n<33;n++)
		{
			m=n*n;
			q=m;
			a[1]=m%10;
			a[2]=m/10%10;
			a[3]=m/100;
			if((a[1]==a[2])||(a[1]==a[3])||(a[2]==a[3]))
			{
					b[i++]=q;
				j++;
			}
		}
		j=j-1;
		System.out.printf("total:%d,and they are:",j);
		for(j=i-1;j>=0;j--)
			System.out.printf("%d ",b[j]);
	}

}
