package org.alkemy.disney.service;

import org.alkemy.disney.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<?> moviesAll();
    void guardarMovie(Movie movie);
    Optional<Movie> consultarMovie(Long id);
    Movie actualizarMovie(Long id);
    Movie eliminarMovie(Long id);

}
