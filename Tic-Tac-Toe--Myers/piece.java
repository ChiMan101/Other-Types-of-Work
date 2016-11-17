public class piece
{
    
    public String description;
    public int myVal1;
    public int myVal2;
    public boolean isActive;
    
    public piece()
    {
        // initialise instance variables
        description = "";
        myVal1 = 0;
        myVal2 = 0;
        isActive = false;
    }
    
    public piece(String desc1, int val1, int val2, boolean flag)
    {
        description = desc1;
        myVal1 = val1;
        myVal2 = val2;
        isActive = flag;
    }
    

}