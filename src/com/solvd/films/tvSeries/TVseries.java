package com.solvd.films.tvSeries;

public abstract class TVseries implements Completeness {

    private String name;
    private int releaseYear;
    private int runtime;
    private String producer;


    public TVseries(){

    }

    public TVseries(String name, int releaseYear, int runtime, String producer){
        this.name = name;
        this.releaseYear = releaseYear;
        this.runtime = runtime;
        this.producer = producer;


    }

    public String toString(){
        return ("Name: " + getName() + "\nRelease year: " + getReleaseYear() +" year" + "\nDuration minutes: " + getRuntime() + " minutes" + "\nProducer: " + getProducer());
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public int getRuntime(){
        return runtime;
    }

    public void setRuntime(int runtime){
        this.runtime = runtime;
    }

    public String getProducer(){
        return producer;
    }

    public void setProducer(String producer){
        this.producer = producer;
    }



}
