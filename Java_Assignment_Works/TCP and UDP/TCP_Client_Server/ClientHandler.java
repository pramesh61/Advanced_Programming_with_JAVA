
import java.io.*;
import java.net.*;

class ClientHandler extends Thread {

    Socket s;

    ClientHandler(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            BufferedReader in
                    = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("Client: " + in.readLine());
            s.close();
        } catch (Exception e) {
        }
    }
}
