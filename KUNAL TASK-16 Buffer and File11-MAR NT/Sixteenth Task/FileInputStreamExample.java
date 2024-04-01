import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            String filePath = "C:\\Users\\KUNAL\\OneDrive\\Documents\\Numetry Technology\\Dialog.txt";

            inputStream = new FileInputStream(filePath);

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
