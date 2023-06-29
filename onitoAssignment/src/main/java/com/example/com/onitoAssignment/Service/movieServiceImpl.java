package com.example.com.onitoAssignment.Service;

import com.example.com.onitoAssignment.Dao.movieDao;
import com.example.com.onitoAssignment.Exception.movieException;
import com.example.com.onitoAssignment.Exception.ratingException;
import com.example.com.onitoAssignment.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class movieServiceImpl  implements movieService{

    @Autowired
    private movieDao  movieDao ;



    @Override
    public List<MovieDtoInterface> longestDurationMovie() throws movieException {
        List<MovieDtoInterface> list = movieDao.LongestDurationMovie() ;

        if(list != null ){
            return list ;

        }else {
            throw new  movieException ("somthing went wrong there is no top 10 movie duratiopn vise ") ;

        }

    }

    @Override
    public String saveMovie(movies movie) throws movieException {

         movieDao.insertData(movie.getTconst() ,movie.getTitletype() , movie.getPrimaryTitle() , movie.getRuntimeMinutes(), movie.getGenres()); ;

//        if(m != null) {
//            s = "Success" ;
//            return s;
//
//        }else {
//            throw new  movieException ("somthing went wrong ") ;
//       }
        return "success" ;
    }


    @Override
    public List<Top_rated_movieInterface> topRatedMovies() throws ratingException {

        List<Top_rated_movieInterface> list = movieDao.TopRatedMovies() ;

        if(list != null ){
            return list ;

        }else {
            throw new ratingException ("somthing went wrong there is no top rated movie") ;

        }
    }

    @Override
    public void updateRunTimeMiniute() {

        movieDao.updateRunTimeMiniute();


    }

    public List<Genre_totalInterface> genre_wise_Total() {

        List<Genre_totalInterface> list  = movieDao .genre_vise_Total();

            return list ;

    }


}
