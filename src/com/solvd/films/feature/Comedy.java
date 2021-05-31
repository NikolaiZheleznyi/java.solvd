package com.solvd.films.feature;


import java.util.Scanner;

public class Comedy extends Feature {

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
    @Override
    public void indicateRating() {
        Scanner in = new Scanner(System.in);
        System.out.println("Describe how you like the film: ");
        String num = in.nextLine();
        System.out.println("You rate the film at: " + num);
    }
}
