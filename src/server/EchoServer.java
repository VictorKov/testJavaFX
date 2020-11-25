package server;

import java.io.IOException;
import java.net.ServerSocket;

public class EchoServer {

    public static final int SERVER_PORT = 8189;

    public static void main(String[] args) {

       try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)){

           System.out.println("Ожидание подключения...");
       }
       catch (IOException e){
           System.out.println("Порт уже занят");
           e.printStackTrace();
       }


    }
}
