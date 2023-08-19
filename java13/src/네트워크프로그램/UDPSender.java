package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// UDP용 소켓과 패킷이 있어야함.
		DatagramSocket socket = new DatagramSocket();
		// UDP용 소켓과 패킷이 있어야함. (데이터, 데이터의 크기, ip, port)
		String s = "i am java programmer..";
		byte[] data = s.getBytes();
		//localhost, 127.0.0.1==> 자기pc의 ip
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8888);
		// 소켓을 이용해서 패킷을 보낸다.!
		socket.send(packet);
		socket.close();
	}

}
