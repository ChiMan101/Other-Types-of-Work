import java.util.Scanner;
public class TheAmazingPatternsClickThisOne
{
    public static void main (String[] args)
    {
     
        Scanner sc = new Scanner(System.in);

         
        System.out.print("Please enter number of rows: ");
        int rows = sc.nextInt();
         
        System.out.println("\tHere is the pattern you inputted... ");  
        System.out.println("");

         
        for (int i = 1; i <= rows; ++i) 
        {

             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
             for (int j = 0; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            for (int j = i; j <= rows; j++) 
            { 
                System.out.print("\\-| |-| |-| |-| |-| |-| |-| |-|\\         "); 
            } 
             
            System.out.println("\n"); 
        } 
         

         
        
    }

}
