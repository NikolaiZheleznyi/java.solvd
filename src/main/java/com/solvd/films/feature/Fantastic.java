package com.solvd.films.feature;


public class Fantastic extends Feature {

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
    public String toString(){
        return ("Fantasy\n" + "Name: " + getName() + "\nRelease year: " + getReleaseYear() +" year" + "\nDuration minutes: " + getDurationMinutes() + " minutes" + "\nProducer: " + getProducer());
    }

}


