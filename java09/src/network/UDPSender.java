package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//UDP socket필요
		DatagramSocket socket = new DatagramSocket();
		
		//packet은 ip, port, data를 실어주어야함.
		//ip는 해당 부품으로 만들어 줘야 함.
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		//packet의 데이터는 byte배열로 만들어서 보내야 한다.
		String str = "i am a ai program";
		byte[] data = str.getBytes();
		
		//UDP packet필요
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
		
		//socket을 이용하여 packet을 보내자.
		socket.send(packet);
		socket.close();
	}

}
