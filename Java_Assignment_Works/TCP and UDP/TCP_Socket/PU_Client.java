import java.net.*;
import java.io.*;

public class PU_Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 6000);

        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeUTF("Message from Pokhara University");

        s.close();
    }
}
