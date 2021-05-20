package com.solvd.films.featureFilms.fantastic;

public class Back_to_the_future extends Fantastic{
    public Back_to_the_future(){
        setName("Back to the future");
        setRelease_year(1985);
        setDuration_minutes(116);
        setProducer("Robert Zemecis");
    }

    public void printInfoBackToTheFuture(){
        System.out.println("------------------");
        printInfo();
    }
}
