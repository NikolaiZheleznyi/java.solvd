package com.solvd.films;

import com.solvd.films.featureFilms.Cartoon;
import com.solvd.films.featureFilms.Comedy;
import com.solvd.films.featureFilms.Drama;
import com.solvd.films.featureFilms.Fantastic;
import com.solvd.films.featureFilms.Cartoon;
import com.solvd.films.tvSeries.MiniSeries;
import com.solvd.films.tvSeries.Prequel;

public class Executor {

    public static void main(String[] args) {


        Comedy internFilm = new Comedy();
        internFilm.printInfo();
        System.out.println("----------------------");
        Drama greenMile = new Drama();
        greenMile.printInfo();
        System.out.println("----------------------");
        Fantastic backToTheFuture = new Fantastic();
        backToTheFuture.printInfo();
        System.out.println("----------------------");
        Cartoon up = new Cartoon();
        up.printInfo();
        System.out.println("----------------------");
        MiniSeries sonsLiberty = new MiniSeries();
        sonsLiberty.printInfo();
        sonsLiberty.seriesOver();
        System.out.println("----------------------");
        Prequel snowpiercer = new Prequel();
        snowpiercer.printInfo();
        snowpiercer.seriesOver();
        System.out.println("----------------------");
    }


}