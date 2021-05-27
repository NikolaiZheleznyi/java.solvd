package com.solvd.films.featureFilms;

public class Cartoon extends FeatureFilm{

    private int ageCategory;

    public Cartoon(){
        setName("Up");
        setReleaseYear(2009);
        setDurationMinutes(96);
        setProducer("Pit Docter");
        setAgeCategory(6);
    }
    public Cartoon(String name, int release_year, int duration_minutes, String producer, int ageCategory){
        this.ageCategory = ageCategory;
    }
        public int getAgeCategory(){
        return ageCategory;
        }

        public void setAgeCategory(int ageCategory){
        this.ageCategory = ageCategory;
        }

    @Override
    public void printInfo(){
        System.out.println("Cartoon");
        System.out.println("Name: " + getName());
        System.out.println("Release year: " + getReleaseYear() +" year");
        System.out.println("Duration minutes: " + getDurationMinutes() + " minutes");
        System.out.println("Producer: " + getProducer());
        System.out.println("Age rating category: " +"+"+ getAgeCategory());
    }
}
