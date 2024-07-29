public class Main
{
	public static void main(String[] args) {	    
	    String a="abc10b3cd13";
	    int i,cn=0;	    
	    for( i=0;i<a.length();i++)
	    {
	        String c="";   
	        while(a.charAt(i)>='a' && a.charAt(i)<='z')
	        {
	            c=c+a.charAt(i);
	            i++;
	        }        
	        if(a.charAt(i)>='0' && a.charAt(i)<='9') //abc10b3cd13
	        {	            
	  	              int num=0;
        while(i<=a.length()-1 && a.charAt(i)>='0' && a.charAt(i)<='9' )
	                {         
	                int d1=a.charAt(i)-'0';
	                    num=num*10+d1; 
	                    i++;    
	                }
	                cn=num;
	                i--;
	                for(int j=0;j<cn;j++)
	            System.out.print(c);
	            }
	            System.out.println();      
	        }         
	    }
}