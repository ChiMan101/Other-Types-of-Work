import java.util.Scanner;
public class testDriver
{

    /**
     * Constructor for objects of class testDriver
     */
    public static void main(String[] args)
    {
        Number num1 = new Number();
        Number num2 = new Number("Prime", "Number only divisble 1 or itself", 7);
        System.out.println("Here is num1:\nname: "+ num1.name +"\nDescription: "+num1.descript+"\nValue: "+num1.value);
        double newDouble1 = num1.addTen(25);
        double newDouble2 = num1.addTen(newDouble1);  
        
        
        System.out.print("Here is num1 ");
        String dot = "... ";
        slowPrint (dot, 800);
        System.out.println(newDouble1+" and: "+newDouble2);
        
        System.out.println("Here is num2:\nname: "+ num2.name +"\nDescription: "+num2.descript+"\nValue: "+num2.value);
        
        
    }
    public static void slowPrint (String message, long millisPerChar)
    {
        for (int i = 0; i < message.length(); i++)
        {
            System.out.print(message.charAt(i));
            try
            {
                Thread.sleep(millisPerChar);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }  
    }
}

