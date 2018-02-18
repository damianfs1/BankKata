import java.io.PrintStream;

public class Account {

    private float balance=0;
    private float credit=0;
    private float debit=0;

    private static String DATE = "10/01/2012";
    private static String HEADER = "date || credit || debit || balance\n";

    public void printStatement(PrintStream ps) {
        String fullBankStatement = HEADER;
        if(balance == 0 && credit == 0 && debit == 0) {
            ps.print(fullBankStatement);
        }
        fullBankStatement+= DATE;
        fullBankStatement+= " || "+credit+" || ";
        if(debit == 0 ){
            fullBankStatement+= "|| ";
        }
        balance += credit - debit;
        fullBankStatement+= balance;
        ps.print(fullBankStatement);
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public void setDebit(float debit) {
        this.debit = debit;
    }

}
