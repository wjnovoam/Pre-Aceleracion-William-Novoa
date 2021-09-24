package org.alkemy.disney.service;

import org.alkemy.disney.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> moviesAll();
    void guardarMovie(Movie movie);
    Movie consultarMovie(Long id);
    Movie actualizarMovie(Long id);
    Movie eliminarMovie(Long id);

}
