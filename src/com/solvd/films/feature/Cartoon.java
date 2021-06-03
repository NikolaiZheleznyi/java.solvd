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
    public void printInfo(){
        System.out.println("Cartoon");
    }

}
