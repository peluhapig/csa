public class Circle
{
  private int radius;

  public Circle(int r)
  {
    radius = r;
  }

  public double getArea()
  {
    return Math.PI * radius * radius;
  }

  public double getCircumference()
  {
    return 2 * radius * Math.PI;
  }
}