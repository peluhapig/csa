import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a word ");
    String w = in.nextLine();
    Hangman h = new Hangman(w);
    for (int n = 1; n <= 40; n++) 
    {
      System.out.println(" "); // add 40 blank lines to hide secret word
    }
    System.out.println(h); // show word as asterisks
   
    while(h.keepPlaying()){
      Scanner guess = new Scanner(System.in);
      System.out.print("Enter a letter ");
      String g = guess.nextLine();

      h.guess(g);
      System.out.println(h);
    }

    if(h.won()){
      System.out.println("You won");
    }else{
      System.out.println("You lose");
    }
    System.out.println("Secret word was: "+h.getSecret());
    // -------------------------------
    // Create a loop to continue while keepPlaying is true
    // User will guess a letter, call the appropriate method, 
    // then display accordingly. 
    // -------------------------------
    
    
    // -------------------------------
    // check if win or lose, and display the secret word
    // -------------------------------
    
      
  }
}