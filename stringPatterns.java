
public class stringPatterns
{
 

    /**
     * Constructor for objects of class stringPatterns
     */
    public static void main(String[] args)
    {
        String patterns = "";
        int maxLines = 7;
        
        for(int outer = 0; outer < maxLines; outer++)
        {
            patterns += "zy";
            
            for(int inner1 = 0; inner1 < outer; inner1++)
            {
                patterns += "y";
            }
            /*
            for(int inner2 = maxLines - outer; inner2 > 0; inner2--)
            {
                patterns += "z";
            }
            */
                //patterns += "\n";
        }
        
        System.out.println(patterns);
    }

}
