public class Number
{
    // instance variables - replace the example below with your own
    String name;
    String descript;
    double value;

    public Number()
    {
        this.name = "Harambe";
        this.descript = "The number named Harambe...";
        this.value = 420;
    }
    
    public Number(String name1, String des1, double val1)
    {
        this.name = name1;
        this.descript = des1;
        this.value = val1;
    }
    
    public Number(String name1, String des1)
    {
        this.name = name1;
        this.descript = des1;
        this.value = 0;
    }

    public double addTen(double num1)
    {
        return num1 + 10;
    }
    
    public void changeName(String name1)
    {
        this.name =  name1;
    }
    
    public void changeDescript(String descript1)
    {
        this.descript =  descript1;
    }
}
