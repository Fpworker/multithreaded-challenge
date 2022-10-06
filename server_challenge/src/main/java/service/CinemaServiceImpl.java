package service;

import java.net.Socket;

public class CinemaServiceImpl implements CinemaService{


    public CinemaServiceImpl(){
     //please provide connection, set port and run GenerateNewUserConnection
    }

    public void generateNewUserConnection() {
        // this method is used for the main program logic
        // please catch client connection and generate new thread for him
        //remember 1 client message = 1 thread, 10 same client message = 1 thread not 10 threads :)
        //run SaveMovieToSchedule method inside this method
    }


    public void saveMovieToSchedule(Socket connection) {
        //you need to pass socket to this method from GenerateNewUserConnection()
        //inside this method you need to send message to our client with correct information - simple "OK" for example
        //don't worry about blocking your space in this quest - you'll be worried about that in the next challenge :)
        //you can use Messages package send example Messages to user
    }

    public void activeThreads() {
        //you have to prove to me that by releasing 5 clients and 6 messages,
        //including from 1 client 2 messages, it will generate 5 threads, not 6

        //it is up to you how you prove it to me, there may be visual shows, there may be unit tests
        System.out.println("Threads active: " + Thread.activeCount());
    }
}
