import java.util.Random;
import java.util.Scanner;
public class BeeWorld
{
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        int beeSize = 0;
        int chance = 0;
        String[] nameList = {"Cancer", "Dancer", "Prancer", "Flancer", "Lancer", "Aancer", "Bancer", "Eancer", "Bouncer"}; 
        
        System.out.println("Hello, welcome to Bee Simulator 2017.");
        System.out.println("How many bees would you like in our colony?");
        beeSize = scan.nextInt();
        
        Bee[] beeWorld = new Bee[beeSize];
        System.out.println("Running bee sim over 25 days...");
        for(int i = 0; i < beeWorld.length; i++)
        {
            Random rand = new Random();
            Random rand2 = new Random();
            int namepos = rand2.nextInt(nameList.length);
            
            chance = rand.nextInt(99) + 1;
            if(chance <= 50)
            {
                beeWorld[i] = new BumbleBee(nameList[namepos]);
            }
            else
            {
                beeWorld[i] = new HoneyBee(nameList[namepos]);
            }
        }
        
        for(int i = 0; i < 25; i++)
        {
            for(int j = 0; j < beeWorld.length; j++)
            {
                if(beeWorld[j] instanceof BumbleBee)
                {
                    ((BumbleBee)beeWorld[j]).numStings += ((BumbleBee)beeWorld[j]).sting(); 
                }
                if(beeWorld[j] instanceof HoneyBee)
                {
                    ((HoneyBee)beeWorld[j]).numFlowers += ((HoneyBee)beeWorld[j]).pollinate(); 
                }
            }
        }
        System.out.println("Summary\n----------------------------");
        
        for(int i = 0; i < beeWorld.length; i++)
        {
            System.out.println("Name: "+beeWorld[i].myName);
            if(beeWorld[i] instanceof BumbleBee)
            {
               System.out.println("Type: Bumblebee");
               System.out.println("Number of Stings: "+((BumbleBee)beeWorld[i]).numStings);
            }
            if(beeWorld[i] instanceof HoneyBee)
            {
               System.out.println("Type: Honeybee"); 
               System.out.println("Number of Flower Pollinated: "+((HoneyBee)beeWorld[i]).numFlowers);
            }
            
            System.out.println("\n");
        }
    }

}
