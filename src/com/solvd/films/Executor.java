package com.solvd.films;

import com.solvd.films.feature.Rating;
import com.solvd.films.feature.Comedy;
import com.solvd.films.feature.Drama;
import com.solvd.films.feature.Cartoon;
import com.solvd.films.feature.Fantastic;
import com.solvd.films.tvSeries.MiniSeries;
import com.solvd.films.tvSeries.Prequel;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        int index = 0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("What interests you (comedy, drama, cartoon, fantastic, TVseries): ");
            String category = in.nextLine();
            switch (category) {
                case "comedy":
                    Comedy internFilm = new Comedy();
                    internFilm.printInfo();
                    System.out.println(internFilm.toString());
                    Rating comedyRate = new Comedy();
                    comedyRate.indicateRating();
                    System.out.println("----------------------");
                    index = 10;
                    break;
                case "drama":
                    Drama greenMile = new Drama();
                    greenMile.printInfo();
                    System.out.println(greenMile.toString());
                    Rating dramaRate = new Drama();
                    dramaRate.indicateRating();
                    System.out.println("----------------------");
                    index = 10;
                    break;
                case "fantastic":
                    Fantastic backToTheFuture = new Fantastic();
                    backToTheFuture.printInfo();
                    System.out.println(backToTheFuture.toString());
                    Rating fantastRate = new Fantastic();
                    fantastRate.indicateRating();
                    System.out.println("----------------------");
                    index = 10;
                    break;
                case "cartoon":
                    Cartoon up = new Cartoon();
                    up.printInfo();
                    System.out.println(up.toString());
                    Rating upRate = new Cartoon();
                    upRate.indicateRating();
                    System.out.println("----------------------");
                    index = 10;
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
                    index = 10;
                    break;
                default:
                    System.out.println("Not found, try again");
                    break;
            }
            index++;
        }
        while (index < 10);
    }
}
