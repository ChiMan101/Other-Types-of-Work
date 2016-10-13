import java.util.Random;

public class smurfVille
{


    public static void main(String[] args)
    {
        Smurf[] smurfVille = new Smurf[20];
        int chance = 0;
        String smurfname;
        String[] nameList = {"Cancer", "Dancer", "Prancer", "Flancer", "Lancer", "Aancer", "Bancer", "Eancer", "Bouncer"}; 
        
        for(int i = 0; i < smurfVille.length; i++)
        {
            Random rand = new Random();
            chance = rand.nextInt(99) + 1;
            if(chance <= 30)
            {
                smurfVille[i] = new RedSmurf();
                System.out.println("Red Smurf");
            }
            else
            {
                smurfVille[i] = new GreenSmurf();
                System.out.println("Green Smurf");
            }
        }
        
        /*for(int i = 0; i < 14; i++)
        {
            for(int i = 0; i < smurfVille.length; i++)
            {
                if(smurfVille[i] instanceof GreenSmurf)
                {
                    System.out.println("Green Smurf");
                    (GreenSmurf smurfVille[i]).plantTrees();
                }
            }
        }*/
        
        
    }
    
    
}
