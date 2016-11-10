
public class HomeLoan extends BankLoan
{
    // instance variables - replace the example below with your own
    private static int numStudentLoans;
    public String studentName;

    public HomeLoan()
    {
        // initialise instance variables
        super();
        numStudentLoans = 0;
        studentName = "No Name Found";
    }
    
    public HomeLoan(int loan, String name, double principal, double inter)
    {
        super(principal, inter);
        // initialise instance variables
        numStudentLoans = loan;
        studentName = name;
    }
}
