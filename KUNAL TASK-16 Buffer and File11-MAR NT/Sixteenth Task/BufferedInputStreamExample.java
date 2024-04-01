import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        BufferedInputStream inputStream = null;
        try {
            String filePath = "C:\\Users\\KUNAL\\OneDrive\\Documents\\Numetry Technology\\Dialog.txt";

            FileInputStream fileInputStream = new FileInputStream(filePath);

            inputStream = new BufferedInputStream(fileInputStream);

            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
