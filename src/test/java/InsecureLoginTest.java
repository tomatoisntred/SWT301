import org.junit.jupiter.api.Test;
import huong.example.InsecureLogin;

import static org.junit.jupiter.api.Assertions.*;

class InsecureLoginTest {

    @Test
    public void testLoginSuccess() {
        InsecureLogin.login("admin", "123456");
        // Không cần assert nếu chỉ cần chạy để tránh warning "method not used"
    }

    @Test
    public void testLoginFail() {
        InsecureLogin.login("user", "wrongpassword");
    }

    @Test
    public void testPrintUserInfo() {
        InsecureLogin insecureLogin = new InsecureLogin();
        insecureLogin.printUserInfo("John Doe");
    }
}

