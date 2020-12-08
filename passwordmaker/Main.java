import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int digits = 0;
    
    while ( digits < 5 )
    {
      System.out.println("Your password must have at least 5 characters.");
      System.out.print("How many characters do you want in your password? ");
      digits = scan.nextInt();
    }

    String choices = "abcdefghijklmnopqrstuvwxyz" ;
    choices = choices + choices.toUpperCase() ;
    choices = choices + "1234567890123456789012345678901234567890!@#$%&*!@#$%&*!@#$%&*" ;
    String number = "0123456789";
    String password = "";
    for (int j = 0 ; j < digits ; j++)
    {
      int pos = (int)(Math.random() * choices.length());
      password = password + choices.charAt( pos );
    }
    // restart if ____
    System.out.println("Here is your password: " + password );
  }
}