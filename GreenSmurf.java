import java.util.Random;
public class GreenSmurf extends Smurf
{
    public int myTrees = 0;
    public int myAcorns = 0;
    
    public GreenSmurf()
    {
        super();
        myName = "";
        myTrees += plantTrees();
        myAcorns += findAcorns();
    }
   
    
    public int plantTrees()
    {
        Random rand = new Random();
        int treesGrown = 0;
        
        treesGrown = rand.nextInt(9) + 1;
        
        
        return treesGrown;
    }
    
    public int findAcorns()
    {
        Random rand = new Random();
        int findAcorn = rand.nextInt(99) + 1;
        int amountAcorns = 0;
        
        if(findAcorn <= 35)
        {
            amountAcorns = rand.nextInt(24) + 1;
            System.out.println(myName+"found "+amountAcorns+" acorns.\n");
            return amountAcorns;
        }
        else
        {
            System.out.println(myName+"didn't find any acorns today.\n");
        }
        
        return amountAcorns;
    }
}
