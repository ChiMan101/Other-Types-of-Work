import java.util.Random;
public class GreatPumpkin extends Pumpkin
{
    private int totalRisen;
    private int totalSeen;
    public GreatPumpkin()
    {
        super();
        totalRisen = 0;
        totalSeen = 0;
    }
    
    public GreatPumpkin(String myName, int myRisen, int mySeen)
    {
        super(myName);
        totalRisen = myRisen;
        totalSeen = mySeen;
    }
    
    public int doHalloween(int numRisesThisYear)
    {
        totalRisen += numRisesThisYear;
        int chanceSeen;
        
        Random rand1 = new Random();
        chanceSeen= rand1.nextInt(100)+1;
        if(chanceSeen <= 25)
        {
            totalSeen += 1;
            return totalSeen;
        }
        else
        {
            return 0;
        }
    }
    
    public int getRisen()
    {
        return totalRisen;
    }
    
    public int getSeen()
    {
        return totalSeen;
    }
    
    public int setRisen(int val)
    {
        totalRisen = val;
        return totalRisen;
    }
    
    public int setSeen(int val)
    {
        totalSeen = val;
        return totalSeen;
    }
}
