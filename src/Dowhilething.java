import java.util.Scanner;

public class Dowhilething {

	public static void main(String[] args) {
		
		String money="yes";
		do
		{
			if(money.equals("no"))
			{
				System.out.println("goto the kitchen and cut the vegatables");
				break;
			}
			
			System.out.println(" food menu is available here ");
			Scanner sc=new Scanner(System.in);
			System.out.println("do you have money:");
			money=sc.next();
			
		}
		while(money.equals("no"));
		
	
			
		}

	}

