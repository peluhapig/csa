public class Secret
{
  private int mystery;

  public  Secret()
  {
    mystery = (int)(Math.random() * (100 - 1 + 1) + 1) ;

  }

  /**
   * check if guess is too high, too low, or correct
   * @param guessed number
   * @return true if correct, false otherwise
   */
  public boolean checkGuess( int guess )
  {
    if (guess == -1) {
      return false;
    }
    if (guess != mystery){
      if(guess >mystery){
        System.out.println("Too high");
        return false;
        
      }else{
        System.out.println("Too low");
        return false;
        
      }
    }else{
      System.out.println("You got it");
      return true;
      
    }
    
    

  }

}