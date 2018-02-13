import java.util.Scanner;

public class E3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x,i,t=0;
		x=input.nextInt();
		for(i=2;i<x/2;i++)
		{
			if(x%i==0) {t=1;break;}
			
			
		}
		if(x>0&&x!=1&&t==0)System.out.println("YES");
		else System.out.println("NO");
		
		
		
	}

}
