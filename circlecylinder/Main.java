import java.util.Scanner;


class Main 
{
  public static void main(String[] args) 
  {
    Scanner radius = new Scanner(System.in);
    System.out.println("Enter radius");
    int r = radius.nextInt();
    //asks width
    Scanner height = new Scanner(System.in);
    System.out.println("Enter width");
    int h = height.nextInt();
    //asks height

    Cylinder user = new Cylinder(r,h);
    System.out.println("Volume: " + user.getVolume());

    Scanner side = new Scanner(System.in);
    System.out.println("Enter side");
    int s = side.nextInt();
    //asks side

    Square input = new Square(s);
    System.out.println("Area: " + input.getArea());
    System.out.println("Volume: " + input.getArea()*s);
    System.out.println("Inscribed circle area: " + input.incircleArea());

  }
}