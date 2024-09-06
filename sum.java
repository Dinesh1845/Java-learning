
import java.io.*;

public class sum {
    public static void main(String[] args) throws IOException {
        BufferedReader name = new BufferedReader( new InputStreamReader(System.in));

        String h = name.readLine();
        System.out.println("say " + h);
        name.close();
    }
}
