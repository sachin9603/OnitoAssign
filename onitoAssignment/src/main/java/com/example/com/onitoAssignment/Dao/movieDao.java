package com.example.com.onitoAssignment.Dao;

import com.example.com.onitoAssignment.Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface movieDao extends JpaRepository<movies, String> {




    @Query(value = "SELECT m.tconst, m.primaryTitle, m.genres, r.averageRating FROM movies m JOIN rating r ON m.tconst = r.tconst WHERE r.averageRating > 6.0 ORDER BY r.averageRating DESC", nativeQuery = true)
    List<Top_rated_movieInterface> TopRatedMovies();
    @Modifying
    @Transactional
    @Query(value = "UPDATE movies SET runtimeMinutes = CASE WHEN genres = 'Documentary' THEN runtimeMinutes + 15 WHEN genres = 'Animation' THEN runtimeMinutes + 30 ELSE runtimeMinutes + 45 END" , nativeQuery = true)
    public void updateRunTimeMiniute() ;

    @Query(value ="SELECT m.genres AS Genre, m.primaryTitle, SUM(r.numVotes) AS numVotes FROM movies m INNER JOIN rating r ON m.tconst = r.tconst GROUP BY m.genres, m.primaryTitle WITH ROLLUP" ,  nativeQuery = true)
    public List<Genre_totalInterface>  genre_vise_Total() ;

    @Query(value ="SELECT tconst, primarytitle, runtimeminutes, genres FROM movies ORDER BY runtimeminutes DESC LIMIT 10" ,  nativeQuery = true)
    List<MovieDtoInterface> LongestDurationMovie() ;



    @Query(value = "INSERT INTO movies (tconst, titleType, primaryTitle, runtimeMinutes, genres) VALUES (:value1, :value2, :value3, :value4, :value5)", nativeQuery = true)
    @Modifying
    @Transactional
    void insertData(@Param("value1") String value1, @Param("value2") String value2 ,  @Param("value3") String value3,  @Param("value4") Integer value4 , @Param("value5") String value5 );

}
