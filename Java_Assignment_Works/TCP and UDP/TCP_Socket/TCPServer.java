import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        BufferedReader in =
            new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out =
            new PrintWriter(s.getOutputStream(), true);
        BufferedReader serverInput =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Client: " + in.readLine());
        System.out.print("Server: ");
        out.println(serverInput.readLine());

        s.close();
        ss.close();
    }
}
