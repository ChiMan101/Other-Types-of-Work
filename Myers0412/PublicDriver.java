import java.util.Random;
public class PublicDriver
{
    public static void main(String[] args)
    {
        MrPrivate[] privateVille = new MrPrivate[5];
        double balanceAmount;
        
        for(int i = 0; i < privateVille.length; i++)
        {
            Random rand = new Random();
            balanceAmount = rand.nextInt(1000000);
            
            privateVille[i] = new MrPrivate(balanceAmount);
        }
    
        
        for(int j = 0; j < privateVille.length; j++)
        {

            System.out.println("Name: "+privateVille[j].myName+j);
            System.out.print("SSN: "+privateVille[j].getSSN());
            System.out.print(" | Account Number: "+ privateVille[j].getacctNum());
            System.out.print(" | Account Balance: "+ privateVille[j].getacctBal());
            System.out.print(" | PIN: "+ privateVille[j].getPIN());
            System.out.print("\n");
            
        }
    }


}
