package com.solvd.films.feature;

;

public class Comedy extends Feature {

    private int funnyMoments;

    public Comedy(){
        setName("Intern");
        setReleaseYear(2015);
        setDurationMinutes(121);
        setProducer("Nancy Myers");
    }

    public Comedy(String name, int releaseYear, int durationMinutes, String producer){
        super(name, releaseYear, durationMinutes, producer);
    }


    @Override
    public void printInfo(){
        System.out.println("Comedy");

    }

}
