import java.util.Scanner;

public class E3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		x=input.nextInt();
		if(x>0&&x%2==0)System.out.println("positive even number");
		else if(x>0&&x%2==1)System.out.println("positive odd number");
		else if(x<0&&x%2==-1)System.out.println("negative odd number");
		else if(x<0&&x%2==0)System.out.println("negative even number");
		else System.out.println("not within the scope of judgment");
	}

}
