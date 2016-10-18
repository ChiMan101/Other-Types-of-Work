import java.util.Random;
public class BumbleBee extends Bee
{
    public int numStings;
    public BumbleBee()
    {
        super();
        numStings = 0;
    }
    public BumbleBee(String name)
    {
        super();
        myName = name;
        numStings = 0;
    }

    public int sting()
    {
        int stings = 0;
        Random rand1 = new Random();
        stings = rand1.nextInt(5)+1;
        return stings;
    }
}
