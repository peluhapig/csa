import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    
    boolean goAgain = true; // Loop control variable, initialized to true so loop will begin
    
    while(goAgain)
    {
      System.out.print("Enter a year: ");
      int y = kb.nextInt();
      kb.nextLine();
      Year year = new Year(y);
      
      if (year.isLeapYear) // boolean is returned from method!
      {
         System.out.println(year + " is a leap year!");
      }
      else
      {
        System.out.println(year + " is not a leap year");
      }
      
      System.out.print("Do you want to enter another year? (y/n): ");
      String choice = kb.nextLine();
      
      goAgain = choice.equals("y"); //either true or false
    }

    kb.close();
  }

}