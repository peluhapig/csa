import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Soup sp1 = new Soup();
    String ingredient = ""; 
    boolean exit;

    while(exit){
      System.out.println("So wanna add something to the soup?");
      String ing = scan.nextLine();
        if(ing.equals("exit")){
          exit = false;

        }else{
          spl.add(ing);
        }
      
    }
    System.out.println(spl.toString);
    System.out.println(spl.count());

    // this example does not use a loop. Yours should!
    // sp1.add("onions");
    // sp1.add("chicken");
    // System.out.println(sp1.toString());
    //
    // Soup sp2 = new Soup();
    // sp2.add("noodles");
    // sp2.add("rat");
    // sp2.add("salt");
    // System.out.println(sp2); //.toString() is implied!
  }
}