public class Pumpkin
{
    private String name;
    public Pumpkin()
    {
        name = setName("none");
    }
    
    public Pumpkin(String myName)
    {
        name = setName(myName);
    }
    
    public String getName()
    {
        return name;
    }
    
    public String setName(String val)
    {
        name = val;
        return name;
    }
}
