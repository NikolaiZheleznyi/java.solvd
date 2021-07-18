package com.solvd.films.feature;


public class Cartoon extends Feature {


    public Cartoon(){
        setName("Up");
        setReleaseYear(2009);
        setDurationMinutes(96);
        setProducer("Pit Docter");
    }
    public Cartoon(String name, int release_year, int duration_minutes, String producer){
    }

    @Override
    public String toString(){
        return ("Cartoon\n" + "Name: " + getName() + "\nRelease year: " + getReleaseYear() +" year" + "\nDuration minutes: " + getDurationMinutes() + " minutes" + "\nProducer: " + getProducer());
    }


}
