package org.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Simple Redis CLI");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            String command = scanner.nextLine();

            if ("exit".equals(command))
                break;

            String[] tokens = command.split(" ");

            RequestDTO requestDTO = new RequestDTO(tokens[0]);
            requestDTO.setParams(Arrays.copyOfRange(tokens, 1, tokens.length));

            ResponseDTO responseDTO = Client.sendMessage(requestDTO);
            System.out.println(responseDTO.getBody());
        }

    }
}