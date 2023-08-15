package com.example.mvcarchitectureimplementation.ui;

import com.example.mvcarchitectureimplementation.pojo.MoviesModel;

public class MoviePresenter {
    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }

    private MoviesModel getDataFromModel()
    {
        return new MoviesModel(1,"The Hell",1000);
    }

    public void getMoviename()
    {
        view.onGetMovieName(getDataFromModel().getName());
    }
}
