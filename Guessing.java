import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
		
			System.out.println("I'm thinking of a number between 1 and 100");
		
		}
	
		{
		
			System.out.println("Can you guess it");
	
		}
		
		Scanner cin = new Scanner(System.in); 
		
		int a = (1);
		
		int b = (100);
		
		boolean bobs = true; 
		
		int random = (int)( a + b * Math . random());	
		
		while(bobs=true)
		{int guess = cin.nextInt(); //gets the guess
			if(guess==random) //checks if the guess is = the random number
			{
				System.out.println("Right");
				
				break;
			}
		 
		if(guess>random) //check if the guess is > the random number
		{
			System.out.println("Too High");
		}
			
		
		if(guess<random) //check if the guess is < the random number
		{
			System.out.println("Too Low");
		}
		
		}
		cin.close();
	}
		
	}
	


