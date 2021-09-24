package org.alkemy.disney.repository;

import org.alkemy.disney.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
    List<Personaje> findAll();
    Optional<Personaje> findById(Long id);
    void deleteById(Long id);
}
