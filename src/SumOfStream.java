import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SumOfStream {
    public static void main(String[] args) throws IOException {
        //byte[] origin = {1, 2, 3, 4};
        InputStream inputStream = new ByteArrayInputStream(new byte[] {1, 2, 3, 4, -5});
        int ans = sumOfStream(inputStream);
        System.out.println(ans);
    }

    static int sumOfStream(InputStream inputStream) throws IOException {
        int b = 0;
        int sum = 0;
        try {
            while((b = inputStream.read()) != -1) {
                sum += (byte) b;
            }
        } catch (IOException e) {
            throw e;
        } finally {
            inputStream.close();
        }
        return sum;
    }
}
