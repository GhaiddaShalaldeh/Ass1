package com.example.ass1.model;

public class MoviesFactory {
    public IMoveDa getModel()
    {
        return new MoveDa();
    }
}
