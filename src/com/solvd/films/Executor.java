package com.solvd.films;

import com.solvd.films.featureFilms.comedy.*;
import com.solvd.films.featureFilms.drama.*;
import com.solvd.films.featureFilms.fantastic.*;

public class Executor {

    public static void main(String[] args) {


        Intern intern_film = new Intern();
        intern_film.printInfoIntern();
        GreenMile greenMile = new GreenMile();
        greenMile.printInfoGreenMile();
        Back_to_the_future backToTheFuture = new Back_to_the_future();
        backToTheFuture.printInfoBackToTheFuture();
    }

}