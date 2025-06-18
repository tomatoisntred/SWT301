package huong.example;

// Interface định nghĩa hành vi login
interface LoginHandler {
    boolean login(String username, String password);
}

// Lớp cài đặt cụ thể cho LoginHandler
class SimpleLoginHandler implements LoginHandler {
    @Override
    public boolean login(String username, String password) {
        return "admin".equals(username) && "1234".equals(password);
    }
}

// Lớp main để kiểm thử
class LoginHandlerExample {
    public static void main(String[] args) {
        LoginHandler handler = new SimpleLoginHandler();

        // Thử đăng nhập đúng
        boolean success = handler.login("admin", "1234");
        System.out.println("Login successful? " + success);

        // Thử đăng nhập sai
        boolean fail = handler.login("user", "wrong");
        System.out.println("Login successful? " + fail);
    }
}
