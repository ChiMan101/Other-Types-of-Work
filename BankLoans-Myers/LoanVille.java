import java.util.ArrayList;
public class LoanVille
{

    public static void main(String[] args)
    {
        ArrayList<BankLoan> myLoans = new ArrayList<BankLoan>();
        int myrand = (int) (Math.random()*50)+1;

        for(int i =0; i < myrand; i++)
        {
            int rand1 = (int) (Math.random()*100)+1;
            int rand2 = (int) (Math.random()*10)+1;
            int rand3 = (int) (Math.random()*10000)+1000;
            int rand4 = (int) (Math.random()*50000)+100000;
            double rand5 = (double) (Math.random()*.1)+.05;
            rand5 = rand5 *(1/12);
            if(rand1 <= 30)
            {
                StudentLoan sLoan = new StudentLoan("student"+i, rand2, rand3, rand5);
                myLoans.add(sLoan);
            }
            else
            {
                HomeLoan hLoan = new HomeLoan(rand2, "loaner"+i, rand4, rand5);
                myLoans.add(hLoan);
            }

        }

        for(int t = 0; t < 24; t++)
        {
            for(int j = 0; j < myLoans.size(); j++)
            {
                for(BankLoan oneBank : myLoans)
                {
                    if(oneBank instanceof StudentLoan)
                    {
                        
                    }
                }
            }
        }

    }
}
