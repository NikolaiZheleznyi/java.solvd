package com.solvd.films.tvSeries;

public class Prequel extends TVseries{

    public Prequel(){
        setName("Snowpiercer");
        setReleaseYear(2020);
        setRuntime(1260);
        setNumberOFseasons(2);
        setProducer("Sam Miller");
        setSerialStatus("continues");
    }

    public  Prequel(String name, int releaseYear, int runtime, int numberOFseasons, String producer, String serialStatus){
        super(name, releaseYear, runtime, numberOFseasons, producer, serialStatus);
    }

    public void seriesOver(){
        System.out.println("Serial status: "+ getSerialStatus());
    }
    @Override
    public void printInfo(){
        System.out.println("Prequel");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getReleaseYear() +" year");
        System.out.println("Duration minutes: " + getRuntime() + " minutes");
        System.out.println("Number of seasons: " + getNumberOFseasons());
        System.out.println("Producer: " + getProducer());

    }
}


