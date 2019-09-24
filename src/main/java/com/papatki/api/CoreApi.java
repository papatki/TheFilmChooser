package com.papatki.api;


import info.talacha.filmweb.api.FilmwebApi;
import info.talacha.filmweb.connection.FilmwebException;
import info.talacha.filmweb.models.User;
import info.talacha.filmweb.models.WatchlistItem;

import java.util.List;

public interface CoreApi {

    void exit();
    void printUserWatchList(FilmwebApi fa, User user, List<WatchlistItem> watchlistItems) throws FilmwebException;
    List<WatchlistItem> getUserWatchList(FilmwebApi fa, User user) throws FilmwebException;
    WatchlistItem chooseRandomMovie(List<WatchlistItem> watchlistItem);
    void printChosenMovie(FilmwebApi fa, WatchlistItem watchlistItem) throws FilmwebException;

}
