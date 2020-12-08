public class Hangman
{
  private String secret;       // the actual word
  private String display = ""; // what is displayed
  private int numLeft;         // number of guesses

  public Hangman(String s)
  {
    secret = s.toLowerCase().trim();  // ensure the secret word is lower case
                                      // and without leading or trailing spaces
    numLeft = 6;               
    int i = 0;
    while(i<secret.length()){
      i++;
      display = display.concat("*");
    }
    // --------------------------------
    // Create a loop that will allow display to contain a series of
    // asterisks equal to the number of characters in secret.
    // --------------------------------

  }

  /**
   * Determine whether or not game should end
   * @return false if numbers of guesses is zero or display equals secret, true otherwise
   */
  public boolean keepPlaying()
  {
    if(numLeft == 0 || display.equals(secret)){
      return false;
    }

    return true;
  }

  /**
   * Process guessed letter
   * @param letter single letter String
   */
  public void guess(String letter)
  {
    letter=letter.toLowerCase();
    boolean match = false; 
    char guess = letter.charAt(0);
    int i = 0;
    while(i<secret.length()){
      if(secret.charAt(i) == (guess)){
        display = display.substring(0,(i))+letter+display.substring(i+1,display.length());
        match = true;
      }
      i++;

    }
    // --------------------------------
    // if letter exists in secret, call the  
    // replace method for each instance of 
    // of letter in secret and set match to true
    // --------------------------------


          
    
    
    if (match == false) // if no match has been found
      numLeft--;
  }

  /**
   * Determine if the game has ended
   * @return true when secret equals display, false otherwise
   */
  public boolean won()
  {
    if(secret.equals(display)){
      return true;
    }

    return false;
  }

  /**
   * Replace letter at given position in display with given replacement
   * @param index - position of letter to be replaced
   * @param s - single letter String to be added to display
   */
  private void replace(int index, String s)
  {
    //Review how this method works. String manipulation is important!
    String temp = display.substring(0, index);
    temp += s;
    temp += display.substring(index + 1);
    display = temp;
  }

  public String getSecret()
  {
    return secret;
  }

  public String toString()
  {
    String x = display + "\tYou have " + numLeft + " guesses left.";
    return x;
  }
}
