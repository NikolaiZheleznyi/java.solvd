package com.solvd.films.tvSeries;

public abstract class TVseries implements Completeness {

    private String name;
    private int releaseYear;
    private int runtime;
    private int numberOFseasons;
    private String producer;
    private String serialStatus;

    public TVseries(){

    }

    public TVseries(String name, int releaseYear, int runtime, int numberOFseasons, String producer, String serialStatus){
        this.name = name;
        this.releaseYear = releaseYear;
        this.runtime = runtime;
        this.numberOFseasons = numberOFseasons;
        this.producer = producer;
        this.serialStatus = serialStatus;

    }

    public abstract void printInfo();

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

    public int getNumberOFseasons(){
        return numberOFseasons;
    }

    public void setNumberOFseasons(int numberOFseasons){
        this.numberOFseasons = numberOFseasons;
    }

    public String getProducer(){
        return producer;
    }

    public void setProducer(String producer){
        this.producer = producer;
    }

    public String getSerialStatus(){
        return serialStatus;
    }

    public void setSerialStatus(String serialStatus){
        this.serialStatus = serialStatus;
    }

}
