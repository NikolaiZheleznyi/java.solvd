package com.solvd.films.featureFilms.drama;

import com.solvd.films.featureFilms.FeatureFilm;

public class Drama extends FeatureFilm {

    private int moments_of_tears;

    public Drama(){

    }

    public Drama(String name, int release_year, int duration_minutes, String producer, int moments_of_tears){
        super(name, release_year, duration_minutes, producer);
        this.moments_of_tears = moments_of_tears;
    }

    public int getMoments_of_tears(){
        return moments_of_tears;
    }
    public void setMoments_of_tears(int moments_of_tears){
        this.moments_of_tears = moments_of_tears;
    }

    @Override
    public void printInfo(){
        System.out.println("Drama");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getRelease_year() +" year");
        System.out.println("Duration minutes: " + getDuration_minutes() + " minutes");
        System.out.println("Producer: " + getProducer());
        System.out.println("Moments of tears in film: " + getMoments_of_tears());
    }
}


