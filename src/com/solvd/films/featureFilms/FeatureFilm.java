package com.solvd.films.featureFilms;

public abstract class FeatureFilm {

    private String name;
    private int release_year;
    private int duration_minutes;
    private String producer;

    public FeatureFilm(){

    }

    public FeatureFilm(String name, int release_year, int duration_minutes, String producer){
        this.name = name;
        this.release_year = release_year;
        this.duration_minutes = duration_minutes;
        this.producer = producer;
    }

    public abstract void printInfo();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRelease_year(){
        return release_year;
    }

    public void setRelease_year(int release_year){
        this.release_year = release_year;
    }

    public int getDuration_minutes(){
        return duration_minutes;
    }

    public void setDuration_minutes(int duration_minutes){
        this.duration_minutes = duration_minutes;
    }

    public String getProducer(){
        return producer;
    }

    public void setProducer(String producer){
        this.producer = producer;
    }
}
