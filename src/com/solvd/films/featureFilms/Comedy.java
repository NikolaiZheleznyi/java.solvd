package com.solvd.films.featureFilms;


public class Comedy extends FeatureFilm {

    private int funnyMoments;

    public Comedy(){
        setName("Intern");
        setReleaseYear(2015);
        setDurationMinutes(121);
        setProducer("Nancy Myers");
        setFunnyMoments(12);
    }

    public Comedy(String name, int releaseYear, int durationMinutes, String producer, int funnyMoments){
        super(name, releaseYear, durationMinutes, producer);
        this.funnyMoments = funnyMoments;
    }

    public int getFunnyMoments(){
        return funnyMoments;
    }
    public void setFunnyMoments(int funnyMoments){
        this.funnyMoments = funnyMoments;
    }

    @Override
    public void printInfo(){
        System.out.println("Comedy");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getReleaseYear() +" year");
        System.out.println("Duration minutes: " + getDurationMinutes() + " minutes");
        System.out.println("Producer: " + getProducer());
        System.out.println("Funny moments in film: " + getFunnyMoments());
    }
}
