package com.solvd.films;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.solvd.films.menu.Menu;
public class Executor {

    public static void main(String[] args) throws JsonProcessingException {
        Menu menu = new Menu();
        menu.startMenu();
    }
}
