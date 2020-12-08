import java.util.Scanner;

/**
 * In this program you will ask the user for four numbers: 
 * starting latitude
 * starting longitude
 * ending latitude
 * ending longitude
 * 
 * Then, using the GeoLocation class, compute the
 * distance in miles between the two locations.
 */

class Main 
{
  public static void main(String[] args) 
  {
    Scanner question1 = new Scanner(System.in);

    System.out.println("Hello Mr. President. There has been a rise in Communist activity in our public sphere.");
    System.out.println("Where is the base you are currently located in?");

    System.out.println("Latitude");
    double startLat = question1.nextDouble();
    Scanner question2 = new Scanner(System.in);
    System.out.println("Longitude");
    double startLong = question2.nextDouble();

    GeoLocation startLoco = new GeoLocation(startLat, startLong);

    GeoLocation northKorea = new GeoLocation(40.3399,127.5101);
    GeoLocation russia = new GeoLocation(55.7558, 37.6173);

    System.out.println("Which country do you want to send a gift to?");
    System.out.println("[1] North Korea [2] Russia [3] Other");
    

    Scanner question3 = new Scanner(System.in);
    int choice = question3.nextInt();

    if (choice == 1){
      double distance = startLoco.distanceFrom(northKorea);

      double time = distance/7500;

      System.out.println("Your currently " + distance + " miles from the recipiant. Your gift will take " + time + " hours to arrive!");

    }
    if (choice == 2){
      double distance = startLoco.distanceFrom(russia);

      double time = distance/7500;

      System.out.println("Your currently " + distance + " miles from the recipiant. Your gift will take " + time + " hours to arrive!");

    }
    if (choice == 3){
      System.out.println("Whats the Latitude?");
      Scanner question4 = new Scanner(System.in);
      int inLat = question4.nextInt();

      System.out.println("Whats the Longitude?");
      Scanner question5 = new Scanner(System.in);
      int inLong = question5.nextInt();

      GeoLocation inputLoco = new GeoLocation(inLat, inLong);

      double distance = startLoco.distanceFrom(inputLoco);

      double time = distance/7500;

      System.out.println("Your currently " + distance + " miles from the recipiant. Your gift will take " + time + " hours to arrive!");

    }

  }
}