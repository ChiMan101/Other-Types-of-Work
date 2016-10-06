import java.util.Random;
public class PixiesMain extends Pixies
{
    public static void main(String[] args)
    {
        String randName = chooseName();
        String randColor = chooseColor();
        Pixies pixie1 = new Pixies(randName, randColor);
        
        pixie1.magicCoins = magicCoinAdd();
        pixie1.makePatterns();
        pixie1.sing();
        pixie1.magicCoins = magicCoinAdd();
        
        System.out.println(pixie1.magicCoins);
    }
    
     public static String chooseName()
    {
        String[] names = {"Tinker Bell", "John", "Emily", "Jane", "Elvis", "Ringo", "Holly"};
        int nameLen = names.length;                   
        String name = names[new Random().nextInt(nameLen)];
        
        return name;
    }
    
    public static String chooseColor()
    {
        String colors [] = {"Blue", "Yellow", "Purple", "Green", "Orange", "Red", "Brown"};
        
        int colorLen = colors.length;                   
        String color = colors[new Random().nextInt(colorLen)];
        
        return color;
    }
}
