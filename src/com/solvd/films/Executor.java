package com.solvd.films;

import com.solvd.films.feature.*;
import com.solvd.films.tvSeries.MiniSeries;
import com.solvd.films.tvSeries.Prequel;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What interests you (comedy, drama, cartoon, fantastic, TVseries): ");
        String category = in.nextLine();
        switch (category) {
            case "comedy":
                Comedy internFilm = new Comedy();
                internFilm.printInfo();
                Rating comedyRate = new Comedy();
                comedyRate.indicateRating();
                System.out.println("----------------------");
                break;
            case "drama":
                Drama greenMile = new Drama();
                greenMile.printInfo();
                Rating dramaRate = new Drama();
                dramaRate.indicateRating();
                System.out.println("----------------------");
                break;
            case "fantastic":
                Fantastic backToTheFuture = new Fantastic();
                backToTheFuture.printInfo();
                Rating fantastRate = new Fantastic();
                fantastRate.indicateRating();
                System.out.println("----------------------");
                break;
            case "cartoon":
                Cartoon up = new Cartoon();
                up.printInfo();
                Rating upRate = new Cartoon();
                upRate.indicateRating();
                System.out.println("----------------------");
                break;
            case "TVseries":
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
}