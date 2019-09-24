package com.papatki.core;

import com.papatki.api.CoreApi;
import info.talacha.filmweb.api.FilmwebApi;
import info.talacha.filmweb.connection.FilmwebException;
import info.talacha.filmweb.models.Film;
import info.talacha.filmweb.models.User;
import info.talacha.filmweb.models.WatchlistItem;

import java.util.List;
import java.util.Random;

public class CoreApiImpl implements CoreApi {

    @Override
    public void exit() {
        System.exit(0);

    }

    @Override
    public void printUserWatchList(FilmwebApi fa, User user, List<WatchlistItem> watchlistItems) throws FilmwebException {
        for (WatchlistItem item : watchlistItems) {
            Film film = fa.getFilmData(item.getItemId());
            System.out.println("~ " + film.getTitle());
        }
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

    @Override
    public void printChosenMovie(FilmwebApi fa, WatchlistItem watchlistItem) throws FilmwebException {
        Film film = fa.getFilmData(watchlistItem.getItemId());
        System.out.println("~ " + film.getTitle() + "\n"+ film.getDuration()
                            +"\n"+ film.getGenre() + "\n" + film.getPlot());
    }
}
