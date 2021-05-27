package com.solvd.films.tvSeries;

public class MiniSeries extends TVseries{

    public MiniSeries(){
        setName("Sons of Liberty");
        setReleaseYear(2015);
        setRuntime(270);
        setNumberOFseasons(1);
        setProducer("Cary Scogland");
        setSerialStatus("finished");
    }

    public  MiniSeries(String name, int releaseYear, int runtime, int numberOFseasons, String producer, String serialStatus){
        super(name, releaseYear, runtime, numberOFseasons, producer, serialStatus);
    }

    public void seriesOver(){
        System.out.println("Serial status: "+ getSerialStatus());
    }
    @Override
    public void printInfo(){
        System.out.println("Mini-serial");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getReleaseYear() +" year");
        System.out.println("Duration minutes: " + getRuntime() + " minutes");
        System.out.println("Number of seasons: " + getNumberOFseasons());
        System.out.println("Producer: " + getProducer());

    }
}

