package com.papatki;

import com.papatki.core.CoreApiImpl;
import com.papatki.ui.ConsoleUiImpl;
import info.talacha.filmweb.api.FilmwebApi;
import info.talacha.filmweb.connection.FilmwebException;
import info.talacha.filmweb.models.User;
import info.talacha.filmweb.models.WatchlistItem;

import java.util.List;

public class Main {

    public static void main(String[] args){

        CoreApiImpl coreApi = new CoreApiImpl();
        ConsoleUiImpl consoleUi = new ConsoleUiImpl();
        FilmwebApi filmwebApi = new FilmwebApi();


        boolean isRunning = true;

        while (isRunning) {
            consoleUi.printMessage("The Movie Chooser");
            consoleUi.printMessage("Please login to Filmweb account");
            consoleUi.printMessage("Login: ");
            String loginInput = consoleUi.getInput();
            consoleUi.printMessage("Password: ");
            String passwordInput = consoleUi.getInput();

            //login to user's filmweb account
            try {
                User user = filmwebApi.login(loginInput, passwordInput);
                consoleUi.printMessage("Dear " + user.getUsername() + "! Welcome in The Movie Chooser");
                consoleUi.printMessage("Your Want to watch movie list:");

                //get user's list of movies
                List<WatchlistItem> watchList = coreApi.getUserWatchList(filmwebApi, user);

                //print the list
                coreApi.printUserWatchList(filmwebApi, user, watchList);

                consoleUi.printMessage("Press 1 to pick random movie from your list");

                int choice = Integer.parseInt(consoleUi.getInput());
                if (choice == 1) {
                    //pick a random movie from the list
                    WatchlistItem movieToWatch = coreApi.chooseRandomMovie(watchList);
                    System.out.println("Your chosen movie is: ");
                    coreApi.printChosenMovie(filmwebApi, movieToWatch);
                    coreApi.exit();
                } else {
                    consoleUi.printMessage("Invalid input.");
                    isRunning = false;
                }
            } catch (FilmwebException e) {
                consoleUi.printMessage("Something went wrong. Try again.");
            }
        }
    }
}
