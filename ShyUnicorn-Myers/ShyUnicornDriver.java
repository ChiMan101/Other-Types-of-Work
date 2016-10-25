import java.util.Random;
public class ShyUnicornDriver
{



    public static void main(String[] args)
    {
        
        ShyUnicorn[] unicornVille = new ShyUnicorn[10];
        
        String[] songPhraseQuotes = {"When the days are cold and the cards all fold and the saints we see are all made of gold", "You used to call me on my cell phone",
                               "0 to 100 real quick.", "Guess who's back, back again. Shady's back, tell a friend", "Wake Me Up Inside. Can't Wake Up.",
                               "Woah, we're half way there. Woah, livin' on a prayer. Take my hand, we'll make it I swear. Woah, livin' on a prayer.",
                               "You've been hit by. You've been hit by. A smooth criminal"};
        
        String[] nameList = {"Cancer", "Dancer", "Prancer", "Flancer", "Lancer", "Aancer", "Bancer", "Eancer", "Bouncer"};       
        
        int name = 0;
        int song = 0;
        int age = 0;
        double weight = 0;
        for(int i = 0; i < unicornVille.length; i++)
        {
           Random rand1 =  new Random();
           Random rand2 =  new Random();
           Random rand3 =  new Random();
           Random rand4 =  new Random();

           name = rand1.nextInt(nameList.length);
           song = rand2.nextInt(songPhraseQuotes.length);
           weight = 500*rand3.nextDouble()+150;
           age = rand3.nextInt(30);
           
           unicornVille[i] = new ShyUnicorn(nameList[name], songPhraseQuotes[song], age, weight);
        }
        
        for(int j = 0; j < unicornVille.length; j++)
        {
            System.out.println("Name: "+unicornVille[j].getNick());
            System.out.print("Fav Phrase: "+unicornVille[j].getFavPhrase());
            System.out.print(" | Weight: "+ unicornVille[j].getWeight()+" lbs.");
            System.out.print(" | Age: "+ unicornVille[j].getAge());
            System.out.print("\n\n");
            
        }
    }


}
