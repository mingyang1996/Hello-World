import java.util.Scanner;

public class E4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int shang,i=1;
		long n=0;
		int yushu[]=new int[10000000];
		n=input.nextLong();
		if(n==0)System.out.printf("%d",0);
		
		//if(n==4294967295)
			//System.out.println("1111111111111111111111111111111");
		while(n!=0)
		{
			yushu[i]=(int)n%2;
			n=n/2;		
			i++;
		}
		i--;

		while(i>=1)
		{	
			System.out.printf("%d",yushu[i]);
			i--;
		}
		
		
		
	}

}
