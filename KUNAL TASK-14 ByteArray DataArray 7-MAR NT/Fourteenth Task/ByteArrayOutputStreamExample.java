import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {

            byteArrayOutputStream.write(9);
            byteArrayOutputStream.write(25);
            byteArrayOutputStream.write(44);
            byteArrayOutputStream.write(72);
            byteArrayOutputStream.write(93);


            byte[] byteArray = byteArrayOutputStream.toByteArray();


            System.out.println("Contents of byte array:");
            for (byte b : byteArray) {
                System.out.println(b);
            }
        }  finally {

            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
