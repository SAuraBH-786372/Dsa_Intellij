import java.net.*;
import java.util.Scanner;
public class Sender {
    public static void main(String[] args) throws Exception {
        System.out.println("Sender");
        Scanner sc=new Scanner(System.in);
        DatagramSocket ds=new DatagramSocket();
        System.out.println("Enter the message");
        while(true){
            String msg=sc.nextLine();
            InetAddress ip=InetAddress.getByName("127.0.0.1");
            System.out.println("Dsender main()"+ip);
            DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),ip,3000);
            ds.send(dp);

        }
    }
}
