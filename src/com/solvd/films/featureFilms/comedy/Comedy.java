package com.solvd.films.featureFilms.comedy;

import com.solvd.films.featureFilms.FeatureFilm;

public class Comedy extends FeatureFilm {

    private int funny_moments;

    public Comedy(){

    }

    public Comedy(String name, int release_year, int duration_minutes, String producer, int funny_moments){
        super(name, release_year, duration_minutes, producer);
        this.funny_moments = funny_moments;
    }

    public int getFunny_moments(){
        return funny_moments;
    }
    public void setFunny_moments(int funny_moments){
        this.funny_moments = funny_moments;
    }

    @Override
    public void printInfo(){
        System.out.println("Comedy");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getRelease_year() +" year");
        System.out.println("Duration minutes: " + getDuration_minutes() + " minutes");
        System.out.println("Producer: " + getProducer());
        System.out.println("Funny moments in film: " + getFunny_moments());
    }
}
