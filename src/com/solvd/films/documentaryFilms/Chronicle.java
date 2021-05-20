package com.solvd.films.documentaryFilms;

public class Chronicle extends DocumentaryFilm{

    private String news;

    public Chronicle(){

    }

    public Chronicle(String name, int release_year, int duration_minutes, String news){
        super(name, release_year, duration_minutes);
        this.news = news;
    }

    public String getNews(){
        return news;
    }

    public void setNews(String news){
        this.news = news;
    }

    @Override
    public void printInfo(){
        System.out.println("Chronicle");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getRelease_year() +"year");
        System.out.println("Duration minutes: " + getDuration_minutes() + "minutes");
        System.out.println("Actual news: " + getNews());
    }

}
