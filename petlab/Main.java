class Main 
{
  public static void main(String[] args) 
  {
    Dog eler = new Dog("eler", 20, "Great Dane");
    
    System.out.println( eler.getname()+"'s Breed: " + eler.getBreed());
    System.out.println( eler.getname()+"'s Happiness: " + eler.getHappiness());
    System.out.println( eler.getname()+"'s Weight: " + eler.getWeight());

    eler.feed(3);
    System.out.println( eler.getname()+"'s Happiness: " + eler.getHappiness());
    System.out.println( eler.getname()+"'s Weight: " + eler.getWeight());
    eler.walk(4);
    System.out.println( eler.getname()+"'s Happiness: " + eler.getHappiness());
    System.out.println( eler.getname()+"'s Weight: " + eler.getWeight());
    eler.scratch();
    System.out.println( eler.getname()+"'s Happiness: " + eler.getHappiness());
    System.out.println( eler.getname()+"'s Weight: " + eler.getWeight());
    eler.scratch(5);
    System.out.println( eler.getname()+"'s Happiness: " + eler.getHappiness());
    System.out.println( eler.getname()+"'s Weight: " + eler.getWeight());

    GuardDog bane = new GuardDog("bane", 30, "Great Dane", 4);
    bane.attack();
    
  }
}