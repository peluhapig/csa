public class Soup
{
  // field/Instance Variable:
  private String ingredients;

  // constructor:
  public Soup() 
  {
    ingredients = "water"; 
    // soup always contains water
  }

  // methods:
  /**
   * Add ingredients to the soup, separated by a comma
   * @param ing ingredient to be added
   */
  public void add(String ingr)
  {
    ingredients.concat(", " + ingr);
  }

  /**
   * Determine of soup tastes tastes good
   * @return false if "rat" found in string, true otherwise
   */
  public boolean tastesGood()
  {
    if(ingredients.contain(rat)){
      return false;
    }else{
      return true;
    }
    
  }
  public int count(){
    int leg = ingredients.length();
    int comma = 1;
    for(i =0; i<leg;i++){
      if(ingredients(i).equals(",")){
        comma++;
      }
    }
    return comma;
  }
  public String toString()
  {
    return "This soup has " + ingredients;
  }

}