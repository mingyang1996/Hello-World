import java.io.IOException;
import java.util.Scanner;

public class E4_11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	Scanner input = new Scanner( System.in);
	/**
	 * @param args
	 * @throws IOException 
	 */
		// TODO Auto-generated method stub
		 int n=0;
		    char c;
		    c=(char)System.in.read();
		    while(c!='\n')
		    {
		    	while(c!=' ')
		    	{
		    		c=(char)System.in.read();
		    		if(c=='\n'||c==' ')
		    		{
		    			n++;
		    			break;
		    		}
		    	}
		    		if(c=='\n')
		    			break;
		    		c=(char)System.in.read();
		    				  
		 }
			System.out.println(n);
	}

}
