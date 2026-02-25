import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234);
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             DataInputStream in = new DataInputStream(socket.getInputStream())) {
            String message = "Hello Server";
            out.writeUTF(message);
            out.flush();
            String response = in.readUTF();
            System.out.println("Server response: " + response);
        } catch (IOException e) {
        }
    }
}