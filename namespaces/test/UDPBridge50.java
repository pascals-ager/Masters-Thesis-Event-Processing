
import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;


class UDPBridge50
{
  String sentence;

    public static void main(String args[]) throws Exception
       {
          DatagramSocket serverSocket = new DatagramSocket(9877);
             byte[] receiveData = new byte[128];
//	DatagramSocket clientSocket = new DatagramSocket();	
//	byte[] sendData = new byte[128];
             while(true)
                {
                   DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                   serverSocket.receive(receivePacket);
                   String sentence = new String( receivePacket.getData(),0,receivePacket.getLength());
//                   System.out.println("RECEIVED: " + sentence);
//                   InetAddress IPAddress = receivePacket.getAddress();
                   int port = receivePacket.getPort();


//			String sentence = new String( receivePacket.getData(),0,receivePacket.getLength());
			List<String> list = Arrays.asList(sentence.split(","));
                       String type=list.get(1);

                       switch(type) {

                        case "A": forward(sentence); break;
                        case "AA": forward(sentence); break;
                        case "AAA": forward(sentence); break;
                        case "AAAA": forward(sentence); break;
                        case "AAAAA": forward(sentence); break;
                        case "AAAAAA": forward(sentence); break;
                        case "AAAAAAA": forward(sentence); break;
                        case "AAAAAAAA": forward(sentence); break;
                        case "AAAAAAAAA": forward(sentence); break;
                        case "TEST": forward(sentence); break;
                case "B": forward(sentence); break;
                case "BB": forward(sentence); break;
                case "BBB": forward(sentence); break; 
                case "BBBB": forward(sentence); break;  
                case "BBBBB": forward(sentence); break; 
                case "BBBBBB": forward(sentence); break; 
                case "BBBBBBB": forward(sentence); break;    
                case "BBBBBBBB": forward(sentence); break; 
                case "BBBBBBBBB": forward(sentence); break; 
                case "BEST": forward(sentence); break;
                case "C": forward(sentence); break;
                case "CC": forward(sentence); break;
                case "CCC": forward(sentence); break; 
                case "CCCC": forward(sentence); break;  
                case "CCCCC": forward(sentence); break; 
                case "CCCCCC": forward(sentence); break; 
                case "CCCCCCC": forward(sentence); break;    
                case "CCCCCCCC": forward(sentence); break; 
                case "CCCCCCCCC": forward(sentence); break; 
                case "CEST": forward(sentence); break;
                case "D": forward(sentence); break;
                case "DD": forward(sentence); break;
                case "DDD": forward(sentence); break; 
                case "DDDD": forward(sentence); break;  
                case "DDDDD": forward(sentence); break; 
                case "DDDDDD": forward(sentence); break; 
                case "DDDDDDD": forward(sentence); break;    
                case "DDDDDDDD": forward(sentence); break; 
                case "DDDDDDDDD": forward(sentence); break; 
                case "DEST": forward(sentence); break;
                case "EEE": forward(sentence); break; 
                case "EEEE": forward(sentence); break;  
                case "EEEEE": forward(sentence); break; 
                case "EEEEEE": forward(sentence); break; 
                case "EEEEEEE": forward(sentence); break;    
                case "EEEEEEEE": forward(sentence); break; 
                case "EEEEEEEEE": forward(sentence); break; 
                case "EEST": forward(sentence); break;                

                                               }

//clientSocket.close();
                   //String capitalizedSentence = sentence.toUpperCase();
                   //sendData = capitalizedSentence.getBytes();
                   //DatagramPacket sendPacket =
                   //new DatagramPacket(sendData, sendData.length, IPAddress, port);
                   //serverSocket.send(sendPacket);
                }
//clientSocket.close();
       }

       public static void forward(String sentence) {
try{
                byte[] sendData = new byte[128];
          DatagramSocket clientSocket = new DatagramSocket();
    InetAddress IPAddress = InetAddress.getByName("10.1.1.1");
    sendData = sentence.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9877);
                clientSocket.send(sendPacket);
          clientSocket.close();
       }
    
     catch(Exception e){
      return;
     }
}

}