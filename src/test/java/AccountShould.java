import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class AccountShould {


    @Test
    public void printDefaultStatementWhenAccountIsEmpty() {
        Account account = new Account();
        PrintStream ps = mock(PrintStream.class);
        account.printStatement(ps);
        verify(ps, times(1)).print("HELLO WORLD");



    }

}
