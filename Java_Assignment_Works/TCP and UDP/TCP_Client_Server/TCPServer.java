import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        final int PORT = 1234;
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            try (Socket clientSocket = serverSocket.accept();
                 DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                 DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream())) {
                String receivedString = in.readUTF();
                System.out.println("Received from client: " + receivedString);
                String upperCaseString = receivedString.toUpperCase();
                out.writeUTF(upperCaseString);
                out.flush();
            }
        } catch (IOException e) {
        }
    }
}