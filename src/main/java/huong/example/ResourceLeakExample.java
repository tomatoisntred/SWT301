package huong.example;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResourceLeakExample {
    private static final Logger logger = Logger.getLogger(ResourceLeakExample.class.getName());

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Có thể thay thế bằng logger.info nếu cần
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading file", e);
        }
    }
}
