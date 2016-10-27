public class OpenDwarf extends Dwarf
{
    public int myBronze;
    public int myAge;
    public String mySong;
    
    public OpenDwarf()
    {
        super();
        myBronze = 0;
        myAge = 0;
        mySong = "";
    }

    public OpenDwarf(String firstname, String lastname)
    {
        super();
        myFirstName = firstname;
        myLastName = lastname;
        myBronze = 0;
        myAge = 0;
        mySong = "";
    }
    
    public boolean work(int earnings)
    {       
       if(earnings < 500)
       {
           System.out.println("Dwarf lost his job... However in Dwarfville there are many jobs still out there.");
           return false;
       }
       else
       {
           myBronze += earnings;
           //myBronze = MyBronze + earnings;
           return true; 
       }
    }
    
    public boolean growOlder(int month)
    {
        myAge = month; 
        return true;
    }
}
