import java.util.Scanner;
public class Main
{

  public static void main(String[] args)
  {
    int guess = -1, count = 0;
    Secret number = new Secret();
    Scanner input = new Scanner (System.in);
    
    while (number.checkGuess(guess) == false)
    {
      count++;
      System.out.println("\nGuess number: " + count);
      System.out.print("Enter your guess: ");
      guess = input.nextInt();
    }
    
    input.close();
  }

}