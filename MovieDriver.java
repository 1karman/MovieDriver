import java.util.Scanner;



public class MovieDriver {
	   public static void main(String[] args) {
	       Scanner user=new Scanner(System.in);
	       
	       //Creates the object
	       Movie m1=new Movie();
	       
	       //Goes through while loop forever until break statement
	       while(true) 
	       {
	       System.out.println("Enter name of movie ");
	       String title=user.nextLine();
	       
	       m1.setTitle(title);
	       System.out.println("Enter rating of movie");
	       String rating=user.nextLine();
	       
	       
	       m1.setRating(rating);
	       System.out.println("Enter number of tickets sold for movie");
	       int soldTickets=Integer.parseInt(user.nextLine());
	       
	       
	       m1.setSoldTickets(soldTickets);
	       System.out.println(m1.toString());
	       System.out.println("Do you want to enter another movie? (y or n)");
	       String choice =user.nextLine();
	       
	       
	       if(choice.equalsIgnoreCase("y"))
	           continue;
	       else
	           break;
	       //exits while loop if user enters "y"
	       }
	       System.out.println("Goodbye");
	   }

	}
