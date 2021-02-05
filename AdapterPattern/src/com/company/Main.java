package com.company;

public class Main {

    public static void main(String[] args) {

        Client client = new Client(5);
        Server server = new Server();

        adapter obj = new adapter();
        obj.connect(server);
        client.getSpeed(obj);

    }
}
