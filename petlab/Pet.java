/**
 * This class will have a subclass, Dog, which may have its 
 * own subclass, GuardDog. This lab introduces and demonstrate 
 * inheritance and the "IS-A" relationship between a superclass
 * and its subclass
 * 
 * @author Mr. Smit
 */

public class Pet
{
  // Instance variables (or fields)
  public String name;
  private double weight, happiness;
  
  /**
   * Pet constructor
   * Assign values to name and weight, and initialize happiness to 5
   * @param n represents name
   * @param w represents weight
   */
  public Pet(String n, int w)
  {
    name = n;
    weight = w;
    happiness = 5;
  }
  
  /**
   * Feed pet, increases pet weight and happiness
   * @param s represents servings of food
   */
  public void feed(int s)
  {
    System.out.println("Feeding...");
    weight *= (1 + s/100.0);
    if (happiness < 10)
      happiness++; // increases happiness to a maximum of 10
  }

  /**
  * @return a String consisting of pet name, weight, and happiness
  */
  public String toString()
  {
    return name + " weighs " + weight + " pounds, and has a happiness level of " + happiness;
  }
  
  
  // Accessor methods
  public double getWeight() // allows other classes to access value of weight
  {
    return weight;
  }
  public double getHappiness() // allows other classes to access value of happiness
  {
    return happiness;
  }
  
  // Modifier methods
  public void setWeight(double w) // used by other classes to change weight
  {
    weight = w;
  }
  public void setHappiness(double h) // used by other classes to change happiness
  {
    happiness = h;
  }
}