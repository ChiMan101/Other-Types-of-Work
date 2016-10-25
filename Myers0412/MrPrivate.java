public class MrPrivate
{
    public String myName;
    private long SSN;
    private long acctNum;
    private double acctBalance;
    private int PIN;

    public MrPrivate()
    {
        myName = "name";
        SSN = 111;
        acctNum = 123;
        acctBalance  = 122312;
        PIN = 4;
    }
    
    public MrPrivate(double balance)
    {
        myName = "name";
        SSN = 111;
        acctNum = 123;
        acctBalance  = balance;
        PIN = 4;
    }


    public long getSSN()
    {
        return SSN;
    }
    
    public long getacctNum()
    {
        return acctNum;
    }
    
    public double getacctBal()
    {
        return acctBalance;
    }
    
    public int getPIN()
    {
        return PIN;
    }
    
    public long setSSN(long val)
    {
        SSN = val;
        return SSN;
    }
    
    public long setacctNum(long val)
    {
        acctNum = val;
        return acctNum;
    }
    
    public double setacctBal(double val)
    {
        acctBalance = val;
        return acctBalance;
    }
    
    public int setPIN(int val)
    {
        PIN = val;
        return PIN;
    }    
}
