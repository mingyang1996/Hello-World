
public class E3_24 {
	public static void main(String[] args) {
		double i,x,sum=1;
		int j;
		for(i=0.001;i<1;i=i+0.001){
			sum=1;
			for(j=1;j<=10;j++)
		{
			sum=sum+sum*i;
	
		}
		if(sum>=2)
			break;
		}
	System.out.printf("%3.1f%%",i*100);
	}
}
