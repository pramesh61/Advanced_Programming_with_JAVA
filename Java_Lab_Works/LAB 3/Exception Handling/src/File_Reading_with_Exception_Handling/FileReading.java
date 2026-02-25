public class FileReading {

    public static void main(String[] args) {
        java.io.FileReader file = null;
        try {
            file = new java.io.FileReader("non_existent_file.txt");
            int data = file.read();
            while (data != -1) {
                System.out.print((char) data);
                data = file.read();
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (java.io.IOException e) {
            System.out.println("Error: An I/O error occurred.");
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (java.io.IOException e) {
                System.out.println("Error: Failed to close the file.");
            }
        }
    }

}