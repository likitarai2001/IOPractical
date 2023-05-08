import java.io.*;

public class InputStreamClass {
    public void readFromFile() throws IOException {
        InputStream is = new FileInputStream("file.txt");

        InputStreamReader isr = new InputStreamReader(is);

        char charArray[] = new char[6];

        isr.read(charArray);

        String contents = new String(charArray);
        System.out.println(contents);

        isr.close();
    }
}
