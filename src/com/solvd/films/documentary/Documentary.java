package com.solvd.films.documentary;

public abstract class Documentary {

    private String name;
    private int release_year;
    private int duration_minutes;

    public Documentary(){

    }

    public Documentary(String name, int release_year, int duration_minutes){
        this.name = name;
        this.release_year = release_year;
        this.duration_minutes = duration_minutes;
    }

    public String toString(){return ("Name: "+getName()+"\nRelease year: " + getRelease_year() +" year" + "\nDuration minutes: " + getDuration_minutes() + " minutes");}

        public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRelease_year(){
        return release_year;
    }

    public void setRelease_year(int release_year){
        this.release_year = release_year;
    }

    public int getDuration_minutes(){
        return duration_minutes;
    }

    public void setDuration_minutes(int duration_minutes){
        this.duration_minutes = duration_minutes;
    }
}

