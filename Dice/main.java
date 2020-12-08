class Main 
{
  public static void main(String[] args) 
  {
    Die d6 = new Die();
    Die d20 = new Die(20);

    System.out.println("d6 rolled:" + d6.getNumDots());
    System.out.println("d20 rolled:" + d20.getNumDots());

    d6.roll();
    d20.roll();

    System.out.println("d6 rolled:" + d6.getNumDots());
    System.out.println("d20 rolled:" + d20.getNumDots());
  }
}