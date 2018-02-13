import java.util.Scanner;

public class xingyunshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			int []a=new int[100];
			int []b=new int[100];
			int i,j,m,k=1,n,q=0,w=1;
			n=input.nextInt();
			for(i=1;i<=n;i++)
			{
				a[i]=input.nextInt();
			}
			
			for(i=1;i<=n;i++)
			{
				m=a[i];
				for(j=1;j<=n;j++)
				{
					if(m==a[j]&&i!=j)
					{
						b[k]=m;
						k++;
					}
				}
	
			}
               for(i=1;i<=n;i++)
               	{  m=a[i];
            	   for(j=1;j<=k;j++)
            	   {
            		   if(a[i]==b[j])
            			   q=1;   
            	   }
            		  if(q==0) {
            			  
            				  System.out.printf("%d ",a[i]);
            		  }
            		  q=0;
            	   
            	   
               }
			
	}

}
