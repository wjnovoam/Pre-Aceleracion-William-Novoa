package org.alkemy.disney.service;

import org.alkemy.disney.entity.Movie;
import org.alkemy.disney.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Movie> consultarMovie(Long id) {
        return movieRepository.findById(id);
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
