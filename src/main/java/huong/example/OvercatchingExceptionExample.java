package huong.example;

public class OvercatchingExceptionExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[2] = 42; // Gán giá trị trước khi truy cập
            System.out.println(arr[2]); // Chỉ số hợp lệ
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        }
    }
}

