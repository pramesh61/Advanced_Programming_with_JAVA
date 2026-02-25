import java.io.*;
import java.net.*;

public class MultiClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 8000);

        BufferedReader user =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out =
            new PrintWriter(s.getOutputStream(), true);

        out.println(user.readLine());
        s.close();
    }
}
