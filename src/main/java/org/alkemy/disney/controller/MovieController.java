package org.alkemy.disney.controller;

import org.alkemy.disney.entity.Movie;
import org.alkemy.disney.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public ResponseEntity<?> peliculasAll(){
        List<?> list = movieService.moviesAll();

        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id-movie}")
    public ResponseEntity<?> consultarMovie(@PathVariable(value = "id-movie") Long id){
        Optional<Movie> oMovie = movieService.consultarMovie(id);

        if(oMovie.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(oMovie);
    }
}
