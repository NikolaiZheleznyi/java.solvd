package com.solvd.films.featureFilms;


public class Fantastic extends FeatureFilm {

    public Fantastic(){
        setName("Back to the future");
        setReleaseYear(1985);
        setDurationMinutes(116);
        setProducer("Robert Zemecis");
    }

    public Fantastic(String name, int releaseYear, int durationMinutes, String producer){
        super(name, releaseYear, durationMinutes, producer);
    }

    @Override
    public void printInfo(){
        System.out.println("Fantastic");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getReleaseYear() +" year");
        System.out.println("Duration minutes: " + getDurationMinutes() + " minutes");
        System.out.println("Producer: " + getProducer());
    }
}


