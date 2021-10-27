package org.alkemy.disney.repository;

import org.alkemy.disney.entity.Character;
import org.alkemy.disney.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    List<Character> findAll();
    Optional<Character> findById(Long id);
    Character save(Character character);
    void deleteById(Long id);
    List<Character> findByNameContaining(String name);
    List<Character> findByAge(Integer age);
    @Query(value="SELECT * FROM movie_characters mc, characters c where mc.id_character = c.id_character and mc.id_movie =:idMovie ", nativeQuery = true)
    List<Character> findByMoviesContaining(Integer idMovie);
}
