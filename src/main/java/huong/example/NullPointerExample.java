package huong.example;

import java.util.Scanner;

public class NullPointerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        // Gán giá trị mặc định nếu text bị null
        text = (text == null) ? "" : text;

        if (!text.isEmpty()) {
            System.out.println("Text is not empty");
        } else {
            System.out.println("Text is empty or null");
        }

        scanner.close();
    }
}