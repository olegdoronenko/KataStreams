import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.IOException;
import java.io.Reader;


public class InputStreamReaderDecoding {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = new ByteArrayInputStream(new byte[] {48, 49, 50, 51});
        Charset charset = Charset.forName("ASCII");
        System.out.println(readAsString(inputStream, charset));


    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder newString = new StringBuilder();
        try (Reader reader = new InputStreamReader(inputStream, charset)) {
            int data = reader.read();
            while (data != -1) {
                newString.append((char) data);
                data = reader.read();
            }
        }catch (IOException e) {

        } return newString.toString();
    }

}
