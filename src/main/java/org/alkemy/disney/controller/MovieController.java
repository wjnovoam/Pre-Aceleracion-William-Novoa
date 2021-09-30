package org.alkemy.disney.controller;

import org.alkemy.disney.entity.Movie;
import org.alkemy.disney.service.interfaces.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/movies")
@CrossOrigin("*")
public class MovieController {

    IMovieService iMovieService;

    public MovieController(IMovieService iMovieService) {
        this.iMovieService = iMovieService;
    }

    @GetMapping
    public ResponseEntity<?> findAllMovie(){
        List<?> list = iMovieService.moviesAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findIdMovie(@PathVariable Long id){
        Optional<Movie> oMovie = iMovieService.getMovieId(id);
        if(oMovie.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(oMovie, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMovie(@PathVariable Long id, @RequestBody Movie movie){
        return new ResponseEntity<>(iMovieService.updateMovie(id, movie), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable Long id){
        iMovieService.deleteMovie(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
