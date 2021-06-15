package com.solvd.films.tvSeries;

public class Prequel extends TVseries{

    public Prequel(){
        setName("Snowpiercer");
        setReleaseYear(2020);
        setRuntime(1260);
        setProducer("Sam Miller");
    }

    public  Prequel(String name, int releaseYear, int runtime, String producer){
        super(name, releaseYear, runtime, producer);
    }

    public void seriesOver(){
        System.out.println("Serial status: ");
    }
    @Override
    public String toString(){
        return ("Name: " + getName() + "\nRelease year: " + getReleaseYear() +" year" + "\nDuration minutes: " + getRuntime() + " minutes" + "\nProducer: " + getProducer());
    }
}


