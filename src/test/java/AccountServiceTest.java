import huong.example.AccountService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceTest {
    AccountService service = new AccountService();

    @ParameterizedTest(name = "[{index}] username={0}, password={1}, email={2}, expected={3}")
    @CsvFileSource(resources = "/datatest.csv", numLinesToSkip = 1)
    void testRegisterAccount(String username, String password, String email, boolean expected) {
        boolean actual = service.registerAccount(username, password, email);
        assertEquals(expected, actual);
    }
}
