package service;

import java.net.Socket;

public interface CinemaService {

    void generateNewUserConnection();

    void saveMovieToSchedule(Socket connection);

    void activeThreads();
}
