package com.solvd.films.documentary;

public class DiaryFilm extends Documentary {

    private String personal_memories_hero;

    public DiaryFilm(){

    }

    public DiaryFilm(String name, int release_year, int duration_minutes, String personal_memories_hero){
        super(name, release_year, duration_minutes);
        this.personal_memories_hero = personal_memories_hero;
    }

    public String getPersonal_memories_hero(){
        return personal_memories_hero;
    }

    public void setPersonal_memories_hero(String personal_memories_hero){
        this.personal_memories_hero = personal_memories_hero;
    }

    @Override
    public String toString(){return ("Name: "+getName()+"\nRelease year: " + getRelease_year() +" year" + "\nDuration minutes: " + getDuration_minutes() + " minutes"+"\nPersonal memories of the hero: " + getPersonal_memories_hero());}

}

