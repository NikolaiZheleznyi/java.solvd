package com.solvd.films;

import com.solvd.films.feature.Rating;
import com.solvd.films.feature.Comedy;
import com.solvd.films.feature.Drama;
import com.solvd.films.feature.Cartoon;
import com.solvd.films.feature.Fantastic;
import com.solvd.films.nomination.Nomination;
import com.solvd.films.tvSeries.MiniSeries;
import com.solvd.films.tvSeries.Prequel;

import java.util.Scanner;

public class Executor {

    public static void main(String[] args) {
        int index = 0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("What interests you (comedy, drama, cartoon, fantastic, TVseries, nominations): ");
            String category = in.nextLine();
            switch (category) {
                case "comedy":
                    Comedy comedy = new Comedy();
                    comedy.printInfo();
                    System.out.println(comedy.toString());

                    Rating comedyRate = new Comedy();
                    comedyRate.indicateRating();

                    Nomination nomination = new Nomination();
                    nomination.addName(comedy);
                    nomination.bestEditing();
                    System.out.println("----------------------");
                    index = 10;
                    break;
                case "drama":
                    Drama drama = new Drama();
                    drama.printInfo();
                    System.out.println(drama.toString());

                    Rating dramaRate = new Drama();
                    dramaRate.indicateRating();
                    System.out.println("----------------------");
                    index = 10;
                    break;
                case "fantastic":
                    Fantastic fantastic = new Fantastic();
                    fantastic.printInfo();
                    System.out.println(fantastic.toString());

                    Rating fantastRate = new Fantastic();
                    fantastRate.indicateRating();
                    System.out.println("----------------------");
                    index = 10;
                    break;
                case "cartoon":
                    Cartoon cartoon = new Cartoon();
                    cartoon.printInfo();
                    System.out.println(cartoon.toString());

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
