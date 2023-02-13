import java.io.*;

public class PrintOfStream {
    public static void main(String[] args) throws IOException {
        //byte[] origin = {1, 2, 3, 4};
        InputStream inputStream = new ByteArrayInputStream(new byte[] {1, 2, 3, 4, -5});
        OutputStream outputStream = new ByteArrayOutputStream();
        print(inputStream, outputStream);
        System.out.println("output " + outputStream.toString());
        System.out.println("input " + inputStream.toString());

    }


    static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int b;
        //int sum = 0;
        try {
            while ((b = inputStream.read()) != -1) {
                //sum += (byte) b;
                if ((byte) b % 2 == 0) {
                    outputStream.write((byte) b);
                }

            }
        } catch (IOException e) {
            throw e;
        } finally {
            inputStream.close();
        }
        inputStream.close();
        outputStream.close();
    }
}
