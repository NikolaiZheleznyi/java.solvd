package com.solvd.films.featureFilms;


public class Drama extends FeatureFilm {

    private int momentsTears;

    public Drama(){
        setName("Green Mile");
        setReleaseYear(1999);
        setDurationMinutes(189);
        setProducer("Frank Darabont");
        setMomentsTears(7);
    }

    public Drama(String name, int releaseYear, int durationMinutes, String producer, int momentsTears){
        super(name, releaseYear, durationMinutes, producer);
        this.momentsTears = momentsTears;
    }

    public int getMomentsTears(){
        return momentsTears;
    }
    public void setMomentsTears(int momentsTears){
        this.momentsTears = momentsTears;
    }

    @Override
    public void printInfo(){
        System.out.println("Drama");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getReleaseYear() +" year");
        System.out.println("Duration minutes: " + getDurationMinutes() + " minutes");
        System.out.println("Producer: " + getProducer());
        System.out.println("Moments of tears in film: " + getMomentsTears());
    }
}


