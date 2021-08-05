package com.solvd.films.tvSeries;

public class MiniSeries extends TVseries{

    public MiniSeries(){
        setName("chernobyl");
        setReleaseYear(2015);
        setRuntime(270);
        setProducer("Cary Scogland");

    }

    public  MiniSeries(String name, int releaseYear, int runtime, String producer){
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

