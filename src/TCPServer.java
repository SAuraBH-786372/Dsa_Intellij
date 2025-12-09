import java.io.*;
import java.net.*;
import java.nio.file.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server;
        DataInputStream in;
        DataOutputStream out=null;
        try{
            server=new ServerSocket(6000,1);
            System.out.println("Server waiting for client");
            Socket socket=server.accept();
            System.out.println("Client connected");
            in=new DataInputStream(socket.getInputStream());
            out=new DataOutputStream(socket.getOutputStream());
            String filename=in.readUTF();
            System.out.println("File requested is:"+ filename);
            byte[] filedata=Files.readAllBytes(Paths.get("src/" + filename));
            String filecontent=new String(filedata);
            out.writeUTF(filecontent.toString());
            System.out.println("File sent successfully!");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            out.writeUTF("File Doesn't exist");
        }

    }
}
