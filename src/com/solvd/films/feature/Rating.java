package com.solvd.films.feature;

import java.util.Scanner;

public class Rating {

    public void indicateRating(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input rating film: ");
        int num = in.nextInt();
        System.out.println("You rate the film at: " + num);
    }

}
