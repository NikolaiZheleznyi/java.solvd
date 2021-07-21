package com.solvd.films.menu;

import com.solvd.films.documentary.DiaryFilm;
import com.solvd.films.documentary.Chronicle;
import com.solvd.films.feature.Rating;
import com.solvd.films.feature.Comedy;
import com.solvd.films.feature.Drama;
import com.solvd.films.feature.Cartoon;
import com.solvd.films.feature.Fantastic;
import com.solvd.films.other.Comments;
import com.solvd.films.other.Nomination;
import com.solvd.films.tvSeries.MiniSeries;
import com.solvd.films.tvSeries.Prequel;
import com.solvd.films.other.FilmsBox;
import org.apache.log4j.Logger;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class Menu {

    private final static Logger LOGGER = Logger.getLogger(Menu.class);

    public void startMenu() throws JsonProcessingException {
        int index = 0;
        do {
            Scanner in = new Scanner(System.in);
            LOGGER.info("What interests you (chronicle, diary, comedy, drama, cartoon, fantastic, miniseries, prequal): ");
            String category = in.nextLine();
            switch (category) {
                case "chronicle":
                    Chronicle chronicle1 = new Chronicle("Chronicle Tod`s", 2020, 120, 	"Yes");
                    Chronicle chronicle2 = new Chronicle("My way", 1999, 63, 	"No");
                    Chronicle chronicle4 = new Chronicle("Night", 2012, 78, 	"No");
                    Chronicle chronicle5 = new Chronicle("After world of war", 1945, 134, 	"Yes");

                    Map<Integer, Chronicle> chronicle = new HashMap<Integer, Chronicle>();
                    chronicle.put(1, chronicle1);
                    chronicle.put(2, chronicle2);
                    chronicle.put(3, chronicle4);
                    chronicle.put(4, chronicle5);
                    chronicle.remove(4);
                    LOGGER.info(chronicle.get(2));

                    index = 10;
                    break;
                case "diary":
                    HashSet<DiaryFilm> diaryFilm1 = new HashSet<DiaryFilm>();
                    diaryFilm1.add(new DiaryFilm("Sans soleil",1983,104,"unknow"));
                    diaryFilm1.add(new DiaryFilm("Runway", 1962,28,"unknow"));

                    for (DiaryFilm p :diaryFilm1){
                        LOGGER.info("Name: " + p.getName());
                        LOGGER.info("Release year: " + p.getRelease_year() + " Duration minutes: " +p.getDuration_minutes());
                    }
                    index = 10;
                    break;
                case "comedy":
                    Comedy comedy = new Comedy();
                    String resultJson = new ObjectMapper().writeValueAsString(comedy);
                    LOGGER.info(resultJson);
                    LOGGER.info("=============");


                    Rating comedyRate = new Comedy();
                    comedyRate.indicateRating();

                    Nomination nomination = new Nomination();
                    nomination.addName(comedy);
                    nomination.bestEditing();
                    LOGGER.info("----------------------");

                    index = 10;
                    break;
                case "drama":
                    Drama drama = new Drama();
                    LOGGER.info(drama.toString());
                    try {
                        Rating dramaRate = new Drama();
                        dramaRate.indicateRating();
                        LOGGER.info("Do you want to like?\n1 - yes\n2 - no");

                        int like = in.nextInt();
                        if (like == 1) {
                            Comments comments = new Comments();
                            comments.commentDrama();
                        } else {
                            LOGGER.info("very sorry");
                        }
                    }
                    catch (ArithmeticException e){System.out.println("Rating will be no more 10");}
                    catch (InputMismatchException ex){ System.out.println("You must enter 1 or 2");}
                    LOGGER.info("----------------------");
                    index = 10;
                    break;
                case "fantastic":
                    Fantastic fantastic = new Fantastic();
                    LOGGER.info(fantastic.toString());

                    Rating fantastRate = new Fantastic();
                    fantastRate.indicateRating();
                    LOGGER.info("----------------------");
                    index = 10;
                    break;
                case "cartoon":
                    Cartoon cartoon = new Cartoon();
                    LOGGER.info(cartoon.toString());

                    Rating upRate = new Cartoon();
                    upRate.indicateRating();
                    LOGGER.info("----------------------");
                    index = 10;
                    break;
                case "miniseries":
                    MiniSeries miniSeries1 = new MiniSeries("asd", 2011,341,"Garry Holson");
                    MiniSeries miniSeries2 = new MiniSeries("chernobyl", 2017, 421, "Bern Adams");

                    FilmsBox miniShowBox = new FilmsBox();
                    miniShowBox.setListMinishow(miniSeries1);
                    miniShowBox.setListMinishow(miniSeries2);

                    for(MiniSeries miniSeries : miniShowBox.getListMinishow()){
                        LOGGER.info(miniSeries.toString());
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
                        LOGGER.info(prequel.toString());
                    }
                    index = 10;
                    break;
                default:
                    LOGGER.info("Not found, try again");
                    break;
            }
            index++;
        }
        while (index < 10);

    }
}
