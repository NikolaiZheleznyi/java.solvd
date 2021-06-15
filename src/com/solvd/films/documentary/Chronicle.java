package com.solvd.films.documentary;

public class Chronicle extends Documentary {

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
    public String toString(){return ("Name: "+getName()+"\nRelease year: " + getRelease_year() +" year" + "\nDuration minutes: " + getDuration_minutes() + "\nminutes"+"Actual news: " + getNews());}


}
