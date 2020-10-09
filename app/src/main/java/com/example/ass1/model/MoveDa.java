package com.example.ass1.model;

import java.util.ArrayList;
import java.util.List;

 class MoveDa  implements IMoveDa{
    private ArrayList <Movies> movie = new ArrayList<>();


    public MoveDa(){
            movie.add( new Movies( "Step Brother",2008,"Comedy"));
            movie.add( new Movies( " White Chicks",2004,"Comedy"));
            movie.add( new Movies( "The hangover",2009,"Comedy"));
            movie.add( new Movies( "The hot Chick",2002,"Comedy"));

            movie.add( new Movies( "Mad Max",2015,"Action"));
            movie.add( new Movies( "The equalize",2014,"Action"));
            movie.add( new Movies( "Logan",2014,"Action"));
            movie.add( new Movies( "The Avengers",2012,"Action"));

            movie.add( new Movies( "After we collided",2020,"Romantic"));
            movie.add( new Movies( "After ",2019,"Romantic"));
            movie.add( new Movies( "356 Days",2020,"Romantic"));
            movie.add( new Movies( "judy",2019,"Romantic"));



        }
        public List<Movies>getMoviesname (String title)
        {
            ArrayList<Movies> data=new ArrayList<>();
            for (Movies a: movie){
                if (a.getName().equals(title)) {
                    data.add(a);

                }
            }
return data;

        }
    public List<Movies> getMoviescat (String cat)
    {
        ArrayList<Movies> data=new ArrayList<>();
        for (Movies b: movie){
            if (b.getCategory().equals(cat)) {
                data.add(b);

            }
        }
        return data;

    }
    public List<Movies>getMoviesyear (String ya)
    {
        ArrayList<Movies> data=new ArrayList<>();
        for (Movies c: movie){
            if (c.getCategory().equals(ya)) {
                data.add(c);

            }
        }
        return data;

    }




//choicec spnner
    public String[] Gettitles(){
        String [] title=new String []{"Step Brother ","White chicks ","The hangover","The hot chick","The equalize","Logan","The Avengers","After we collided","After","356 Days","judy"};
        return title;
    }

    public String[] Getyear(){
        String [] year=new String []{"2008","2004","2009","2002","2015","2014","2014","2012","2020","2019"," 2020","2019"};
        return year;
    }

    public String[] Getcategories(){
        String [] cats=new String []{"Comedy","Action","Romance"};
        return cats;
    }























}
