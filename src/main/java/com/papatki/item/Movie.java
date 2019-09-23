package com.papatki.item;

public class Movie {

    private String title;
    private String genre;
    private String plot;
    private String imageUrl;
    private int duration;
    private int rate;

    public Movie(String title,
                 String genre,
                 String plot,
                 String imageUrl,
                 int duration,
                 int rate) {
        this.title = title;
        this.genre = genre;
        this.plot = plot;
        this.imageUrl = imageUrl;
        this.duration = duration;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
