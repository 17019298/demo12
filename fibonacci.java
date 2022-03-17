package Day4;
// wap to print fibanacci series for 10 times

//0 1 1 2 3 5
public class fibonacci {

	public static void main(String[] args) {

	  int n =5;
	  int a= 0;
	  int b= 1;
	  for(int i=1;i<=n;i++)
	  {
		  System.out.print (" "+ a);   // 0 1 1 2  3 
		  int sum= a+b;            
		  a=b;  
		  b=sum;
				  
	  }	
	}

}
