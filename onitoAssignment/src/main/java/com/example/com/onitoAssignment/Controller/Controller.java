package com.example.com.onitoAssignment.Controller;


import com.example.com.onitoAssignment.Exception.movieException;
import com.example.com.onitoAssignment.Exception.ratingException;
import com.example.com.onitoAssignment.Model.*;
import com.example.com.onitoAssignment.Service.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    private movieService movieService;


    @PostMapping("/new-movie")
    public ResponseEntity<String> addMovie (@RequestBody movies movie) throws movieException {

        String r = movieService.saveMovie(movie);

        return new ResponseEntity<String>(r, HttpStatus.CREATED);
    }


    @GetMapping("/longest-duration-movies")
    public ResponseEntity<List<MovieDtoInterface>> longestDurationMovie()  throws movieException{

        List<MovieDtoInterface> list = movieService.longestDurationMovie() ;


        return new ResponseEntity< List<MovieDtoInterface> >(list, HttpStatus.OK);
    }


    @GetMapping("/top-rated-movies")
    public ResponseEntity<List<Top_rated_movieInterface>> Top_rated_moviess()  throws ratingException {

        List<Top_rated_movieInterface> list = movieService.topRatedMovies();


        return new ResponseEntity< List<Top_rated_movieInterface> >(list, HttpStatus.OK);
    }

    @GetMapping("/genre-movies-with-subtotals")
    public ResponseEntity<List<Genre_totalInterface>> genre_wise_Totall()  throws movieException {

        List<Genre_totalInterface> list = movieService.genre_wise_Total();


        return new ResponseEntity< List<Genre_totalInterface> >(list, HttpStatus.OK);
    }




    @GetMapping("/update-runtime-minutes")
    public void updte_runtimemin()  throws movieException {

                movieService.updateRunTimeMiniute();
    }



}
