package com.example.com.onitoAssignment.Service;

import com.example.com.onitoAssignment.Exception.movieException;
import com.example.com.onitoAssignment.Exception.ratingException;
import com.example.com.onitoAssignment.Model.*;

import java.util.List;

public interface movieService {
    public String saveMovie(movies movie) throws movieException;

    public List<MovieDtoInterface>   longestDurationMovie() throws  movieException ;


    public List<Top_rated_movieInterface> topRatedMovies() throws ratingException;


    public void  updateRunTimeMiniute() ;

  public  List<Genre_totalInterface> genre_wise_Total() ;





}
