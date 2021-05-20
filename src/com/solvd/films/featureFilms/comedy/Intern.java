package com.solvd.films.featureFilms.comedy;

public class Intern extends Comedy{

    public Intern(){
        setName("Intern");
        setRelease_year(2015);
        setDuration_minutes(121);
        setProducer("Nancy Myers");
        setFunny_moments(15);
    }

    public Intern(String name, int release_year, int duration_minutes, String producer, int funny_moments){
        super(name, release_year, duration_minutes, producer, funny_moments);
    }

    public void printInfoIntern(){
        System.out.println("-------------Comedy Film---------------");
        printInfo();
    }
}
