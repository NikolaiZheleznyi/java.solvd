package com.solvd.films.featureFilms.drama;

public class GreenMile extends Drama {

    public GreenMile(){
        setName("Green Mile");
        setRelease_year(1999);
        setDuration_minutes(189);
        setProducer("Frank Darabont");
        setMoments_of_tears(7);
    }

    public GreenMile(String name, int release_year, int duration_minutes, String producer, int moments_of_tears){
        super(name, release_year, duration_minutes, producer, moments_of_tears);
    }

    public void printInfoGreenMile(){
        System.out.println("----------------------------");
        printInfo();
    }
}
