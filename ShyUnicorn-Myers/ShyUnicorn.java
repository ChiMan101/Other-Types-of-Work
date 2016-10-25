
public class ShyUnicorn
{
    private String nickname;
    private String favoritePhrase;
    private int age;
    private double weight;
    
    public ShyUnicorn()
    {
        nickname = "Horsey";
        favoritePhrase = "I am Shy Unicorn";
        age = 0;
        weight = 6.9;
    }
    
    public ShyUnicorn(String name, String favPhr, int HorseAge, double myWeight)
    {
        nickname = name;
        favoritePhrase = favPhr;
        age = HorseAge;
        weight = myWeight;
    }
    
    public String getNick()
    {
        return nickname;
    }
    
    public String getFavPhrase()
    {
        return favoritePhrase;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public String setNick(String val)
    {
        nickname = val;
        return nickname;
    }
    
    public String setFavPhrase(String val)
    {
        favoritePhrase = val;
        return favoritePhrase;
    }
    
    public int setAge(int val)
    {
        age = val;
        return age;
    }
    
    public double setWeight(double val)
    {
        weight = val;
        return weight;
    }    
}
