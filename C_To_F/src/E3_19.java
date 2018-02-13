import java.util.Scanner;

public class E3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i=0,n,m;
		int []a=new int[10];
		n=input.nextInt();
		m=n;
		while(m!=0)
		{
			a[i]=m%10;
			m=m/10;
			i++;
		}
		i--;
		while(i!=-1) {
			System.out.printf("%2d",a[i]);
			i--;
		}
		if(n==0)
			System.out.printf("%2d",0);
	}

}
