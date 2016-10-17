import java.util.Random;

public class Snakes
{
    String name;
    String type;
    int numMice;
    
    public Snakes()
    {
        name = "Snakey";
        type = "snakes";
        numMice = 0;
    }
    
    public Snakes(String myName, String myType, int myNumMice)
    {
        name = myName;
        type = myType;
        numMice = myNumMice;
    }

    public Snakes(String myName, String myType)
    {
        name = myName;
        type = myType;
        numMice = 0;
    }
    
     public Snakes(String myName)
    {
        name = myName;
        type = "snake";
        numMice = 0;
    }
    
    public int eatMice()
    {
        Random rand = new Random();
        int miceEaten = 0;
        miceEaten = rand.nextInt(3) + 1;
        return miceEaten;
    }
}
