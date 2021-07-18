package com.solvd.films.feature;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rating {

    public void indicateRating(){
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Input rating film: ");
            int num = in.nextInt();
            if (num > 10) {
                throw new ArithmeticException("Rating will be no more 10");

            }
            System.out.println("You rate the film at: " + num);
        }
        catch (InputMismatchException ex){

        System.out.println(ex.getMessage());
        }
        //catch (Exception e) {
        //    e.printStackTrace();
        //}
    }

}
