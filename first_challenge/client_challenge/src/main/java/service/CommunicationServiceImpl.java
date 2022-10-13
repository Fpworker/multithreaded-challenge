package service;

public class CommunicationServiceImpl implements CommunicationService {

    public CommunicationServiceImpl() {
        //initialize your socket
        //provide run cinemaMenu() method
    }

    public void sendMessage(Integer mode) {

        //in this method you need to send message to server with information for example: I would like to buy a ticket
        //dont worry in this step about row and column your ticket
        //only simple information

        //mode argument from cinemaMenu: 1 - buy ticket
    }

    public void receiveMessage() {

        //you need to provide receive message from server
        //if you get information: OK, task is over
    }

    public void cinemaMenu() {
        //in this place you can write simple menu for user
        //for example: press 1 to buy a ticket
        //if click number 1 send simple string: I would like to buy a ticket
    }
}