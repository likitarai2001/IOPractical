import java.io.*;

public class OutputStreamClass {
    public void writeToFile() throws Exception {
        OutputStream output = new FileOutputStream("file.txt");
        byte b[] = {76, 73, 75, 73, 84, 65};

        output.write(b);

        output.flush();

        output.close();
    }
}
