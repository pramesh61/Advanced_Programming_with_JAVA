public class MultiServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8000);
        System.out.println("Server Started");

        while (true) {
            Socket s = ss.accept();
            new ClientHandler(s).start();
        }
    }
}
