package com.solvd.films.featureFilms;

public class Comedy extends FeatureFilm {

    private String funny_moments;

    public Comedy(){

    }

    public Comedy(String name, int release_year, int duration_minutes, String producer, String funny_moments){
        super(name, release_year, duration_minutes, producer);
        this.funny_moments = funny_moments;
    }

    public String getFunny_moments(){
        return funny_moments;
    }
    public void setFunny_moments(String funny_moments){
        this.funny_moments = funny_moments;
    }

    @Override
    public void printInfo(){
        System.out.println("Comedy");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getRelease_year() +"year");
        System.out.println("Duration minutes: " + getDuration_minutes() + "minutes");
        System.out.println("Actual news: " + getFunny_moments());
    }
}
