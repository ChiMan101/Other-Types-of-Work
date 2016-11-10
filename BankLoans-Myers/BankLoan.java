import java.*;
public class BankLoan
{
    // instance variables - replace the example below with your own
    private static int numLoans;
    
    public String bankName;
    public int accountNumber;
    
    private double loanPrincipal;
    private double loanMonthlyRate;
    private int currentMonths;
    private int currentBalance;
    private double loanBalance;

    public BankLoan()
    {
        // initialise instance variables
        bankName = "no bank found";
        accountNumber = 123;
        loanPrincipal = 0;
        loanMonthlyRate = 0;
        currentMonths = 0;
        currentBalance = 0;
        loanBalance = 0;
    }
    
    public BankLoan(double principal ,double inter)
    {
        loanPrincipal = principal;
        loanMonthlyRate = inter;
    }

    public double calcLoanBalance(int months)
    {
        currentMonths++;
        loanBalance = loanPrincipal * Math.pow(1 + loanMonthlyRate, months);
        return loanBalance;
    }
        
}
