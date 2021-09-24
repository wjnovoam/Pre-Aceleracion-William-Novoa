package org.alkemy.disney.service;

import org.alkemy.disney.entity.Movie;
import org.alkemy.disney.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImplementacion implements MovieService {

    MovieRepository movieRepository;

    public MovieServiceImplementacion(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> moviesAll() {
        return movieRepository.findAll();
    }

    @Override
    public void guardarMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public Movie consultarMovie(Long id) {
        return null;
    }

    @Override
    public Movie actualizarMovie(Long id) {
        return null;
    }

    @Override
    public Movie eliminarMovie(Long id) {
        return null;
    }


}