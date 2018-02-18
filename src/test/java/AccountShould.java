import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.lang.reflect.AccessibleObject;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class AccountShould {


    @Test
    public void printDefaultStatementWhenAccountIsEmpty() {
        Account account = new Account();
        PrintStream ps = mock(PrintStream.class);
        account.printStatement(ps);
        verify(ps, times(1)).print("date || credit || debit || balance\n");
        }

     @Test
    public void printStatementWithCredit(){
         Account account = new Account();
         PrintStream ps = mock(PrintStream.class);
         account.setCredit(200.0f);
         account.printStatement(ps);
         verify(ps,times(1)).print("date || credit || debit || balance\n" +
         "10/01/2012 || 200.0 || || 200.0");

     }

}
