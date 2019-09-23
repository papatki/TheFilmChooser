package com.papatki.api;


import info.talacha.filmweb.api.FilmwebApi;
import info.talacha.filmweb.connection.FilmwebException;
import info.talacha.filmweb.models.User;
import info.talacha.filmweb.models.WatchlistItem;

import java.util.List;

public interface CoreApi {

    void exit();
    User loginToFilmweb(FilmwebApi fa, String login, String password) throws FilmwebException;
    List<WatchlistItem> getUserWatchList(FilmwebApi fa, User user) throws FilmwebException;
    WatchlistItem chooseRandomMovie(List<WatchlistItem> watchlistItem);

}
