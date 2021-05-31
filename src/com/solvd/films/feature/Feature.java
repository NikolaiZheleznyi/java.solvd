package com.solvd.films.feature;

public abstract class Feature extends Rating {

    private String name;
    private int releaseYear;
    private int durationMinutes;
    private String producer;

    public Feature(){

    }

    public Feature(String name, int releaseYear, int durationMinutes, String producer){
        this.name = name;
        this.releaseYear = releaseYear;
        this.durationMinutes = durationMinutes;
        this.producer = producer;
    }

    public abstract void printInfo();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public int getDurationMinutes(){
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes){
        this.durationMinutes = durationMinutes;
    }

    public String getProducer(){
        return producer;
    }

    public void setProducer(String producer){
        this.producer = producer;
    }
}
