import java.util.Random;
public class SneakyDwarf extends Dwarf
{
    private int mySilver;
    private double myAle;
    private String myPassword;
    
    public SneakyDwarf()
    {
        super();
    }

    
    public SneakyDwarf(String firstname, String lastname)
    {
        super();
        myFirstName = firstname;
        myLastName = lastname;
    }
    
    public int stealSilver(int earnings)
    {
        Random rand1 = new Random();
        Random rand2 = new Random();
        int isStolen = rand1.nextInt(100)+1;
        int silverGained = 0;
        if(isStolen <= 25)
        {
            silverGained = rand2.nextInt(200)+1;
            
        }
        else
        {
            return 0;
        }
        
        return mySilver + silverGained;
    }
    
    public boolean drinkAle(double amount)
    {
        if(amount < 1)
        {
            System.out.println("Didn't drink any ale.");
            return false;
        }
        else
        {
            myAle += amount;
            return true;
        }
    }
    
    public double getMyAle()
    {
        return myAle;
    }
    
    public int getMySilver()
    {
        return mySilver;
    }
    
    public String getMyPassword()
    {
        return myPassword;
    }
    
    public double setMyAle(long val)
    {
        myAle += val;
        return myAle;
    }
    
    public int setMySilver(int val)
    {
        mySilver += val;
        return mySilver;
    }
    
    public String setMyPassword(String val)
    {
        myPassword = val;
        return myPassword;
    }
   
}
