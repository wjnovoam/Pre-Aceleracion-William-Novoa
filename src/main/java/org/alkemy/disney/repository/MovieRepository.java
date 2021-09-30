package org.alkemy.disney.repository;

import org.alkemy.disney.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository  extends JpaRepository<Movie, Long> {
    List<Movie> findAll();
    Optional<Movie> findById(Long id);
    void deleteById(Long id);
    boolean existsById(Long id);
}
