package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	// throws Exception : 해당 메서드를 호출한 곳으로 예외처리를 떠넘김
	// try -catch와 동일
	public static void main(String[] args) throws Exception {
		
		// 승인용 서버 소켓 필요
		// 서버 소켓이 클라이언트의 요청을 계속 기다리다가 승인이 떨어지면
		// 양쪽에 데이터 전달용 소켓이 생성!
		// 그 다음에 데이터를 주고 받을 수 있음.
		// ip는 컴퓨터 따라감/ port는 내가 정할 수 있음.
		ServerSocket server = new ServerSocket(9100);
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는 중.");
		int count = 0;
		while (true) {
			Socket socket = server.accept();
			count++;
			System.out.println("클라이언트 연결" + count + "접속");
			//output스트림을 이용해서 클라이언트에게 전송하자.
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.print("i am java programmer");
			out.close();
			socket.close();
		}
	
	
	
	}
}
