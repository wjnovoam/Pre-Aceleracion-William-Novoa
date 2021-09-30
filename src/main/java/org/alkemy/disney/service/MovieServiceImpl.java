package org.alkemy.disney.service;

import org.alkemy.disney.entity.Movie;
import org.alkemy.disney.repository.MovieRepository;
import org.alkemy.disney.service.interfaces.IMovieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements IMovieService {

    private static final String MENSAJE_MOVIE_EXISTE = "La pelicula o serie no existe";

    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> moviesAll() {
        return movieRepository.findAll();
    }

    @Override
    public void createMovie(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public Optional<Movie> getMovieId(Long id){
        return movieRepository.findById(id);
    }

    @Override
    public Movie updateMovie(Long id, Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    public void garantizarExistenciaDeLaMovie(Long id) {
        if(!this.movieRepository.existsById(id)){
            System.out.println(MENSAJE_MOVIE_EXISTE);
        }
    }

}
