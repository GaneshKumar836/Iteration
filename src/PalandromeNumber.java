import java.util.Scanner;//import this package is from Scanner class 

public class PalandromeNumber {//class starts

	public static void main(String[] args) {//main is built-in method
		
	int n,sum=0,temp,r;//initialize the variables
	Scanner sc=new Scanner(System.in);//object is created using new keyword
	System.out.println("enter n value");//print statement 
	n=sc.nextInt();//assign a value to the variable n
		temp=n;    
		  while(n>0)//while condition is verified
		  {    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }  
		   if(sum==temp)//check the condition
		   {
			   System.out.println("palandrome");//print statement
		   }
		   else
		   {
			   System.out.println("not palandrome");//print statement
		   }

}//main method ends
}//class ends
