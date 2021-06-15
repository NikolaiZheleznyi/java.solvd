package com.solvd.films.menu;

import com.solvd.films.documentary.DiaryFilm;
import com.solvd.films.documentary.Chronicle;
import com.solvd.films.feature.Rating;
import com.solvd.films.feature.Comedy;
import com.solvd.films.feature.Drama;
import com.solvd.films.feature.Cartoon;
import com.solvd.films.feature.Fantastic;
import com.solvd.films.other.Nomination;
import com.solvd.films.tvSeries.MiniSeries;
import com.solvd.films.tvSeries.Prequel;
import com.solvd.films.other.FilmsBox;

import java.util.*;

public class Menu {

    public void startMenu() {
        int index = 0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("What interests you (chronicle, diary, comedy, drama, cartoon, fantastic, miniseries, prequal): ");
            String category = in.nextLine();
            switch (category) {
                case "chronicle":
                    Map<Integer, String> chronicle = new HashMap<Integer, String>();
                    chronicle.put(1, "Chronicle Tod`s");
                    chronicle.put(2, "My way");
                    chronicle.put(3, "Night");
                    chronicle.put(4, "sdkfds");
                    chronicle.remove(4);

                    Set<Integer> keys = chronicle.keySet();
                    Collection<String> values = chronicle.values();
                    for(Map.Entry<Integer, String> item: chronicle.entrySet()){System.out.printf("Key: %d Value: %s \n",item.getKey(), item.getValue());}
                    index = 10;
                    break;
                case "diary":
                    HashSet<DiaryFilm> diaryFilm1 = new HashSet<DiaryFilm>();
                    diaryFilm1.add(new DiaryFilm("Sans soleil",1983,104,"unknow"));
                    diaryFilm1.add(new DiaryFilm("Runway", 1962,28,"unknow"));

                    for (DiaryFilm p :diaryFilm1){
                        System.out.println("Name: " + p.getName());
                            System.out.println("Release year: " + p.getRelease_year() + " Duration minutes: " +p.getDuration_minutes());
                    }
                    index = 10;
                    break;
                case "comedy":
                    Comedy comedy = new Comedy();
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
                    System.out.println(drama.toString());

                    Rating dramaRate = new Drama();
                    dramaRate.indicateRating();
                    System.out.println("----------------------");
                    index = 10;
                    break;
                case "fantastic":
                    Fantastic fantastic = new Fantastic();
                    System.out.println(fantastic.toString());

                    Rating fantastRate = new Fantastic();
                    fantastRate.indicateRating();
                    System.out.println("----------------------");
                    index = 10;
                    break;
                case "cartoon":
                    Cartoon cartoon = new Cartoon();
                    System.out.println(cartoon.toString());

                    Rating upRate = new Cartoon();
                    upRate.indicateRating();
                    System.out.println("----------------------");
                    index = 10;
                    break;
                case "miniseries":
                    MiniSeries miniSeries1 = new MiniSeries("asd", 2011,341,"Garry Holson");
                    MiniSeries miniSeries2 = new MiniSeries("chernobyl", 2017, 421, "Bern Adams");

                    FilmsBox miniShowBox = new FilmsBox();
                    miniShowBox.setListMinishow(miniSeries1);
                    miniShowBox.setListMinishow(miniSeries2);

                    for(MiniSeries miniSeries : miniShowBox.getListMinishow()){
                        System.out.println(miniSeries.toString());
                    }
                    index = 10;
                    break;
                case "prequal":
                    Prequel prequel1 = new Prequel("ccc", 1998, 203, "Tim Morris");
                    Prequel prequel2 = new Prequel("ddd", 2011, 175, "Court Jonson");

                    FilmsBox showBox = new FilmsBox();
                    showBox.setListPrequel(prequel1);
                    showBox.setListPrequel(prequel2);

                    for(Prequel prequel : showBox.getListPrequel()){
                        System.out.println(prequel.toString());
                    }
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
