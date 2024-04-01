import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        BufferedOutputStream outputStream = null;
        try {
            String filePath = "C:\\Users\\KUNAL\\OneDrive\\Documents\\Numetry Technology\\Dialog.txt";

            FileOutputStream fileOutputStream = new FileOutputStream(filePath);

            outputStream = new BufferedOutputStream(fileOutputStream);

            String data = "Welcome to Numetry Technology...\n Hello, World!";
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
