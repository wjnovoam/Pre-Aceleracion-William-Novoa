package org.alkemy.disney.service.interfaces;

import org.alkemy.disney.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface IMovieService {
    List<?> moviesAll();
    void createMovie(Movie movie);
    Optional<Movie> getMovieId(Long id);
    Movie updateMovie(Long id, Movie movie);
    void deleteMovie(Long id);

}
