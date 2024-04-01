import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {

        byte[] byteArray = {1, 2, 3, 4, 5};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

        try (DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream)) {
            int intValue = dataInputStream.read();
            byte byteValue = dataInputStream.readByte();
            boolean booleanValue = dataInputStream.readBoolean();

            System.out.println("Read integer value: " + intValue);
            System.out.println("Read byte value: " + byteValue);
            System.out.println("Read boolean value: " + booleanValue);
        } catch (EOFException e) {
            System.err.println("Reached end of stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
