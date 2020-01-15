
/**
 * Write a description of class Craps here.
 *
 * @author Beau Gillam
 * @version 2020-01-15
 */
import java.util.Scanner;

public class Craps
{
    public static void giveInstructions(Scanner in)
    {
       
        System.out.print("Would you instructions on how to play Craps (Y/n)?");
        String playGame = in.nextLine();
       if (playGame.equals("") || 
           playGame.substring(0,1).equalsIgnoreCase("y"))
       {
           System.out.println("1. Roll two dice and add them together.");
           System.out.println("2. If you get a 7 or 11 on your first roll you win,");
           System.out.println("  but if you get a 2, 3, or 12, you lose.");
           System.out.println("  Any other number you don't win or lose. The die roll becomes your 'point.'");
           System.out.println("3. If you didn't win or lose on the first roll, keep");
           System.out.println("  rolling until:");
           System.out.println("  a. you roll your point again, and win!");
           System.out.println("  b. you roll a 7, and your lose...:(");
       }
    }
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("The Game of Craps!");
       giveInstructions(in);
       System.out.println("Let's play a game!");
       
       String playStatus = "y";
       while (playStatus.equals("y"))
       {
           System.out.println("DEBUG: We're playing Craps...");
           
           
           
           
           System.out.print("Would you like the play again (Y/n)?");
           playStatus = in.nextLine();
           if (playStatus.equals("")) { playStatus = "y"; }
           {
               
            }
       }
    }
}
