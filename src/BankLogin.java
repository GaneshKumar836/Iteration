import java.util.Scanner;

public class BankLogin {

	public static void main(String[] args) {
		String username,password;
		int attempt=3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		username=sc.next();
		
		if(username.equals("Ganesh"))
		{
			for(int i=0;i<3;i++)
			{
			 System.out.println("Please Enter Your Password");
			 password=sc.next();
	
	      		if(password.equals("ganesh@123"))
	      		{
				System.out.println("welcome" + username);
				break;
	      		}
			else
				{
				    attempt--;
				   if(attempt==0)
				  {
					   System.out.println("Your account is locked.please contact your neareast branch manager");
					   break;
				  }
					   System.out.println("password is not valid");
					   System.out.println("you have remaining attemps"+attempt);
					
				
			}
		}
		}
		else
		{
			System.out.println("username is not valid");
		}
sc.close();
	}

}

