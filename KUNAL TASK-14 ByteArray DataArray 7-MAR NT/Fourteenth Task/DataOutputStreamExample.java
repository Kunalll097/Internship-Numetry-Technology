import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();


        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);

        try {
            int intValue = 42;
            double doubleValue = 3.14;
            boolean booleanValue = true;

            dataOutputStream.writeInt(intValue);
            dataOutputStream.writeDouble(doubleValue);
            dataOutputStream.writeBoolean(booleanValue);

            dataOutputStream.flush();


            byte[] byteArray = byteArrayOutputStream.toByteArray();


            System.out.println("Contents of byte array:");
            for (byte b : byteArray) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
