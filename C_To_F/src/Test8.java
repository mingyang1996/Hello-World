import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		String x;
		//int a[]=new int[100000];
		int i,j=0,q,begin=0;
		x=input.nextLine();
		char[] st = new char[100000] ;
		char[] ch = x.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
				st[j++]=ch[i];
			else if(ch[i]=='.')
				st[j++]='.';
			else break;
	
		}
		j--;
		if(i<ch.length)
			System.out.println("Error");
		else {
			
			while(st[begin]=='0')
				begin++;
			begin--;
		
			while(st[j]=='0')
				j=j-1;	
			if(st[j]!='.')
			for(i=begin;i<=j;i++)			
			System.out.printf("%c",st[i]);
			
			else
				for(i=begin;i<=j-1;i++)			
					System.out.printf("%c",st[i]);
			}
		
		
	}

}