package com.solvd.films.feature;


import java.util.Scanner;

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
    public void printInfo(){
        System.out.println("Fantastic");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getReleaseYear() +" year");
        System.out.println("Duration minutes: " + getDurationMinutes() + " minutes");
        System.out.println("Producer: " + getProducer());
    }
    @Override
    public void indicateRating() {
        Scanner in = new Scanner(System.in);
        System.out.println("Rate the film with an integer from 1 to 10: ");
        int num = in.nextInt();
        System.out.println("You rate the film at: " + num);
    }
}


