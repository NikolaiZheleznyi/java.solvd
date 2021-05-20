package com.solvd.films.featureFilms.fantastic;

import com.solvd.films.featureFilms.FeatureFilm;

public class Fantastic extends FeatureFilm {

    public Fantastic(){

    }

    public Fantastic(String name, int release_year, int duration_minutes, String producer){
        super(name, release_year, duration_minutes, producer);
    }

    @Override
    public void printInfo(){
        System.out.println("Fantastic");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getRelease_year() +" year");
        System.out.println("Duration minutes: " + getDuration_minutes() + " minutes");
        System.out.println("Producer: " + getProducer());
    }
}


