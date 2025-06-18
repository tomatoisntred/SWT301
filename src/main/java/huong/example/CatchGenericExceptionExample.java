package huong.example;

public class CatchGenericExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println("Chuỗi đang là null, không thể lấy độ dài.");
        } catch (NullPointerException e) {
            System.out.println("Null pointer encountered: variable 's' is null");
        }
    }
}
