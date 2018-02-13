import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		if((((a+b)>c)&&((a-b)<c)))
		{
		if((a==b)&&(b==c))
			System.out.println("equilateral triangle");
		else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a))
			System.out.println("right triangle");	
		else if((a==b)||(b==c)||(a==c))
			System.out.println("isosceles triangle");
		else 
				// ||(((b+c)>a)&&((b-c)<a))||(((a+c)>b)&&((a-c)<b)))
			System.out.println("arbitrary triangle");
		}
		else
			System.out.println("not triangle");
		
	}
 
}
