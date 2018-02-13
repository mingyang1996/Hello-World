import java.util.Scanner;

public class TestPrintPicture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int i,j,k;
		int n;
		char b='A';
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.printf(" ");
				
			}
			b='A';
			for(j=1;j<=2*i-1;j++)
				{
				System.out.printf("%c",b);
				b=(char) (b+1);
				if(b>'Z')	b='A';
				}
			for(j=1;j<=n-i;j++)
			{
				System.out.printf(" ");
			}
			System.out.println();
		}
	}

}
