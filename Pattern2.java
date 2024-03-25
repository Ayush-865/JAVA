import java.util.*; 
public class Pattern2 
{ 
 	public static void main(String[] args) 
 	{ 
 	 	int i,j,k,c=65,l=65; 
 	 	 
 	 	Scanner sc=new Scanner(System.in); 
        	 	System.out.println("Enter number of rows:"); 
 	 	k=sc.nextInt();  	 	for(i=1;i<=k;i++) 
 	 	{ 
 	 	 	for(j=1;j<=k-i;j++) 
 	 	 	{ 
 	 	 	 	System.out.print("  "); 
 
 	 	 	} 
 	 	 	for(j=1;j<=i;j++) 
 	 	 	{ 
 	 	 	 	System.out.print((char)(c)+" "); 
 	 	 	 	c--; 
 
 	 	 	} 
 	 	 	l=l+i+1;
  	 	 	c=l; 
 	 	 	System.out.println(); 
 	 	} 
 	} 
}
