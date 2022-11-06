package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static ResponseDTO sendMessage(RequestDTO requestDTO) throws IOException, ClassNotFoundException {
        InetAddress host = InetAddress.getLocalHost();
        try (Socket socket = new Socket(host.getHostName(), 6789);
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
            oos.writeObject(requestDTO);

            return (ResponseDTO) ois.readObject();
        }
    }
}
