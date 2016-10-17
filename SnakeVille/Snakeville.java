import java.util.Random;
public class SnakeVille
{

    public static void main(String[] args)
    {
        Snakes[] snakeVille = new Snakes[15];
        String[] nameList = {"Cancer", "Dancer", "Prancer", "Flancer", "Lancer", "Aancer", "Bancer", "Eancer", "Bouncer"}; 
        String[] types = {"Python", "Rattlesnake", "Diamondback", "Viper", "Anaconda", "Mamba", "Vipera", "Taipan", "Cottonmouth"};
        int namepos = 0;
        int typepos = 0;
        
        for(int i = 0; i < snakeVille.length; i++)
        {
            Random rand = new Random();
            Random rand2 = new Random();
            namepos = rand.nextInt(nameList.length);
            typepos = rand2.nextInt(types.length);
            
            snakeVille[i] = new Snakes(nameList[namepos],types[typepos]);
        }
        
        for(int j = 0; j < 10; j++)
        {
            for(int k = 0; k < snakeVille.length; k++)
            {
                snakeVille[k].numMice += snakeVille[k].eatMice();
            }
        }
        System.out.println("Summary");
        System.out.println("---------------------------------------------------");
        for(int j = 0; j < snakeVille.length; j++)
        {

            System.out.println("Name: "+snakeVille[j].name);
            System.out.println("Type: "+snakeVille[j].type);
            System.out.println("Mice Eaten: "+ snakeVille[j].numMice);
            System.out.println("");
            
        }
    }
}
