package org.alkemy.disney.repository;

import org.alkemy.disney.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    List<Character> findAll();
    Optional<Character> findById(Long id);
    Character save(Character character);
    void deleteById(Long id);
}
