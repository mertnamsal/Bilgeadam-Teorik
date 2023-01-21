package com.mertnamsal;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MainServerUDP {

	public static void main(String[] args) {
		
		try {
			DatagramSocket socket = new DatagramSocket(5000);
			
			while(true) {
				
				byte[] buffer = new byte[50];
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
				socket.receive(packet);
				String receivedText = new String(buffer, 0, packet.getLength());
				System.out.println("Text received is : "+receivedText);
				
			
				//Echo yapalım
				String returnString = "echo "+ receivedText;
				byte[] buffer2 = returnString.getBytes();
				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				packet = new DatagramPacket(buffer2, buffer2.length,address,port);
				socket.send(packet);
				
				System.out.println("packet port : "+port+" address : "+address);
				System.out.println("Local port : "+socket.getLocalPort()+" Port : "+socket.getPort());
				
				
			}
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
