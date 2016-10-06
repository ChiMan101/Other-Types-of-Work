import java.util.Random;
public class Pixies
{
    String name;
    String color;
    static int magicCoins;
    public Pixies()
    {
        name = "Tinker Bell";
        color = "Green";
        magicCoins = 0;
    }
    
    public Pixies(String name1, String color1)
    {
        name = name1;
        color = color1;
        magicCoins = 0;
    }

    public void sing()
    {
        String[] songQuotes = {"When the days are cold and the cards all fold and the saints we see are all made of gold", "You used to call me on my cell phone",
                               "0 to 100 real quick.", "Guess who's back, back again. Shady's back, tell a friend", "Wake Me Up Inside. Can't Wake Up.",
                               "Woah, we're half way there. Woah, livin' on a prayer. Take my hand, we'll make it I swear. Woah, livin' on a prayer.",
                               "You've been hit by. You've been hit by. A smooth criminal"};
                               
            int songQuoteLen = songQuotes.length;                   
            String songQuote = songQuotes[new Random().nextInt(songQuoteLen)];
            System.out.println(songQuote + "\n");
    }
    
    public void makePatterns()
    {
        int rows = 6;
        for (int outer = 0; outer < rows; outer++) 
        {

            for (int inner2 = rows - outer - 1; inner2 > 0; inner2--) 
            {
                System.out.print("X");
            } 
            for (int i = 0; i < 3; i++) 
            {
                System.out.print("A");
            }
             
             for (int inner1 = 0; inner1 < outer; inner1++) 
            {
                System.out.print("Y");
            }
          
             
            System.out.println("\n"); 
        }
    }
    
    public static int magicCoinAdd()
    {         
        magicCoins += new Random().nextInt(49+1);
        return magicCoins;
    }
    

}
