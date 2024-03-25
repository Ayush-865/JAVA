import java.util.*;
class TotalMarks{
	String n;
	int p,c,m,t;
	static int no;
	static Scanner sc=new Scanner(System.in);
	void read(){
		System.out.println("Enter your name");
		n=sc.next();
		System.out.println("enter marks for physics,chemistry,maths");
		p=sc.nextInt();
		c=sc.nextInt();
		m=sc.nextInt();
		t=p+c+m;
	}
 	public static void main(String args[]){
 		System.out.println("Enter number of students");
 		no=sc.nextInt();
 		TotalMarks temp=new TotalMarks();
 		TotalMarks h[]=new TotalMarks[no];
 		for(int i=0;i<no;i++){
 			h[i]=new TotalMarks();
 			h[i].read();
 		}
 		for(int i=0;i<no;i++){
 			for(int j=0;j<no;j++){
 				if(h[i].t<h[j].t){
					temp=h[j];
					h[j]=h[i];
					h[i]=temp;
				}
			}
		}
		 for(int i=0;i<no;i++){
			 System.out.println(h[i].n+" "+h[i].t);
		 }
	 }
}
