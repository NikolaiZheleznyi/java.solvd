package com.solvd.films.other;

import java.util.*;


import com.solvd.films.tvSeries.MiniSeries;
import com.solvd.films.tvSeries.Prequel;
import com.solvd.films.documentary.DiaryFilm;

public class FilmsBox {

    List<MiniSeries> listMinishow;
    List<Prequel> listPrequel;
    Set<DiaryFilm> setOfDiary;

    public FilmsBox(){
        listMinishow = new ArrayList<MiniSeries>();
        listPrequel = new LinkedList<Prequel>();
        setOfDiary = new HashSet<DiaryFilm>();
    }

    public Set<DiaryFilm> getSetOfDiary(){return setOfDiary;}

    public void setSetOfDiary(DiaryFilm diaryFilm) {setOfDiary.add(diaryFilm);}

    public List<MiniSeries> getListMinishow(){
        return listMinishow;
    }

    public List<Prequel> getListPrequel(){
        return listPrequel;
    }

    public void setListMinishow(MiniSeries miniSeries){
        listMinishow.add(miniSeries);
    }

    public void setListPrequel(Prequel prequel){
        listPrequel.add(prequel);
    }
}
