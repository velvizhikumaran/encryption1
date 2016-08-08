# encryption1
import java.util.Scanner;


public class Encryption {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1[]=s.split(" ");
		int a3=0;
		String s3="";
	    for(int i=0;i<s1.length;i++)
	    {
			int a=s1[i].length();
		    int a1=(int)s1[i].charAt(a-1);
		    a1=a1-96;
		for(int j=0;j<s1[i].length()-1;j++)
		{
		    	int a2=(int)s1[i].charAt(j);
		    	if(64>a2||a2<91)
		    	{
		    		 a3=a2-a1;
		    		 if(a3<65){
		    			 a3=a3+26;
		    		 }
		    	}else if(96>a2||a2<123)
		    	{
		        a3=a2-a1;
		    if(a3<96)
		    {
		    	a3=a3+26;
		   }	
		    }if(a3>90&&a3<97)
		    {
		    	a3=a3+26;
		    }char c=(char)a3;
		    String s4=Character.toString(c);
		    s3=s3+s4;
		
		}
		s3=s3+s1[i].substring(a-1,a)+" ";
		
	}System.out.println(s3);

}
}
