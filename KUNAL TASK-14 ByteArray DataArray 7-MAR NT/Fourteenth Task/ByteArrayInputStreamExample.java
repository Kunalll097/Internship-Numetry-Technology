import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {

        byte[] byteArray = {12, 36, 39, 48, 72};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

        try {
            int byteRead;
            while ((byteRead = byteArrayInputStream.read()) != -1) {
                System.out.println("Read byte: " + byteRead);
            }
        } finally {

            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
