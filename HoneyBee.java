import java.util.Random;
public class HoneyBee extends Bee
{
    public int numFlowers;
    public HoneyBee()
    {
        super();
        numFlowers = 0;
    }
    public HoneyBee(String name)
    {
        super();
        myName = name;
        numFlowers = 0;
    }

    public int pollinate()
    {
        int FlowPoll = 0;
        Random rand1 = new Random();
        FlowPoll = rand1.nextInt(5)+1;
        return FlowPoll;
    }
}
