package com.papatki.core;

import com.papatki.api.CoreApi;
import com.papatki.item.FilmwebUser;
import info.talacha.filmweb.api.FilmwebApi;
import info.talacha.filmweb.connection.FilmwebException;
import info.talacha.filmweb.models.User;
import info.talacha.filmweb.models.WatchlistItem;

import java.util.List;
import java.util.Random;

public class CoreApiImpl implements CoreApi {

    @Override
    public void exit() {

    }

    @Override
    public User loginToFilmweb(FilmwebApi fa, String login, String password) throws FilmwebException {
        User user = fa.login(login, password);
        return user;
    }


    @Override
    public List<WatchlistItem> getUserWatchList(FilmwebApi fa, User user) throws FilmwebException {
        List<WatchlistItem> watchlistItem = fa.getUserWatchlist(user.getId(),0,100);
        return watchlistItem;
    }

    @Override
    public WatchlistItem chooseRandomMovie(List<WatchlistItem> watchlistItem) {
        Random random = new Random();
        WatchlistItem randomItem = watchlistItem.get(random.nextInt(watchlistItem.size()));
        return randomItem;
    }
}
