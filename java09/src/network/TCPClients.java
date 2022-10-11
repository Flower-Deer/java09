package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			//클라이언트가 서버에 접속을 승인받으면
			// 양 쪽에 소켓이 생성
			Socket socket = new Socket("localhost",9100);
			System.out.println("클라이언트가 접속함.>>" +  i);
			
			//input스트림을 통해 가지고 와서 임시기억장치에 넣어두자.
			//스트림(1byte) -- 스트림리더(브릿지클래스) --> 임시기억장치(2byte)
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//아래세줄과 같음.
//			InputStream input = socket.getInputStream();
//			InputStreamReader reader = new InputStreamReader(input);
//			BufferedReader reader2  = new BufferedReader(reader);
			
			String data = buffer.readLine(); //한줄씩 가지고 올 수 있음(2바이트만)
			System.out.println("서버에서 받아온 데이터는 " +data);
		}
	}

}
