import java.util.Scanner;

public class C_To_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		float c;
		System.out.print("celsius = ");
		c=input.nextFloat();
		System.out.printf("fahr = %.6f	\n",c*9/5+32);
		
	}

}
