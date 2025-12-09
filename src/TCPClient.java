import java.io.*;
import java.net.*;
import java.util.Scanner;
public class TCPClient {
    public static void main(String[] args) throws IOException,InterruptedException {
        DataInputStream in;
        DataOutputStream out;
        Scanner sc=new Scanner(System.in);
        Socket socket=new Socket("127.0.0.1",6000);

        System.out.println("Client connected to server");
        System.out.println("Enter the filename to request");
        String filename=sc.nextLine();
        in=new DataInputStream(socket.getInputStream());
        out=new DataOutputStream(socket.getOutputStream());
        out.writeUTF(filename);
        String filecontent=in.readUTF();
        if(filecontent.length()>0){
            System.out.println(filecontent);
        }
        else {
            System.out.println("File is Empty");
        }
    }
}
