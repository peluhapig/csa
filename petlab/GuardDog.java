public class GuardDog extends Dog{
    private double feirceness;

    public GuardDog(String n, int w, String b, double f)
    {
        super(n, w, b);
        feirceness = f;
    }

    public double getFeirceness()
    {
        return feirceness;
    }
    public void attack()
    {
        double w = getWeight();
        double f = getFeirceness();
        String n = getname();

        double damage = (w*f)/100;
        System.out.println("Bark!!");
        
        System.out.println("Woah "+n+", you did " + damage + " damage.");
    }


}