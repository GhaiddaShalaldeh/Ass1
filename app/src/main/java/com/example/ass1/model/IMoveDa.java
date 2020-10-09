package com.example.ass1.model;

import java.util.List;

public interface IMoveDa {
    List<Movies>getMoviesname(String title);
    List<Movies>getMoviesyear(String year);
    List<Movies>getMoviescat(String cat);

    String[] Getcategories();
    String[] Gettitles();
    String[] Getyear();





}
