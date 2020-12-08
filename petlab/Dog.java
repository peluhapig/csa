public class Dog extends Pet {

    private String breed;
    
    public Dog(String n, int w, String b)
    {
        super( n,  w);
        breed = b;

    }

    public String getBreed(){
        return breed;
    }

    public String getname(){
        
        return name;
    }

    public void walk(double t)
    {
        double h = getHappiness();
        double w = getWeight();
        
        setHappiness(h * (1+t/100));
        setWeight(w - (1+t/100));
    }

    public void scratch()
    {
        double h = getHappiness();
        setHappiness(h * (1.1));
    }

    public void scratch(double t)
    {
        double h = getHappiness();
        setHappiness(h * (1+t/10));
    }


}
