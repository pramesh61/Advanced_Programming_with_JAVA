import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);

        BufferedReader user =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out =
            new PrintWriter(s.getOutputStream(), true);
        BufferedReader in =
            new BufferedReader(new InputStreamReader(s.getInputStream()));

        System.out.print("Client: ");
        out.println(user.readLine());
        System.out.println("Server: " + in.readLine());

        s.close();
    }
}
