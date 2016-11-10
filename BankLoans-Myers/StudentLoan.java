
/**
 * Write a description of class StudentLoan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentLoan extends BankLoan
{
    // instance variables - replace the example below with your own
    private static int numStudentLoans;
    public String studentName;

    public StudentLoan()
    {
        // initialise instance variables
        numStudentLoans = 0;
        studentName = "No Name Found";
    }
    
    public StudentLoan(String name, int loan, double principal, double inter)
    {
        // initialise instance variables
        super(principal, inter);
        numStudentLoans = loan;
        studentName = "name";
    }
}
