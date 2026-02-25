import java.net.*;
import java.io.*;

public class PU_Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6000);
        Socket s = ss.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());
        System.out.println(in.readUTF());

        s.close(); ss.close();
    }
}
