import java.io.*;

public class ByteArrayExample {
    public static void main(String[] args) {
        try {

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);

            int intValue = 49;
            double doubleValue = 3.14;
            String stringValue = "Hello, World!";

            dataOutputStream.writeInt(intValue);
            dataOutputStream.writeDouble(doubleValue);
            dataOutputStream.writeUTF(stringValue);

            byte[] byteArray = byteArrayOutputStream.toByteArray();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);

            int readIntValue = dataInputStream.readInt();
            double readDoubleValue = dataInputStream.readDouble();
            String readStringValue = dataInputStream.readUTF();

            System.out.println("Read int value: " + readIntValue);
            System.out.println("Read double value: " + readDoubleValue);
            System.out.println("Read string value: " + readStringValue);

            dataOutputStream.close();
            dataInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
