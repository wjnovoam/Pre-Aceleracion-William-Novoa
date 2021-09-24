package org.alkemy.disney.service;

import org.alkemy.disney.entity.Personaje;
import org.alkemy.disney.repository.PersonajeRepository;

public class PersonajeServiceImplementacion implements PersonajeService{

    PersonajeRepository personajeRepository;

    public PersonajeServiceImplementacion(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    @Override
    public void guardarPersonaje(Personaje personaje) {

    }

    @Override
    public Personaje consultarPersonaje(Long id) {
        return null;
    }

    @Override
    public Personaje actualizarPersonaje(Long id) {
        return null;
    }

    @Override
    public void eliminarPersonaje(Long id) {

    }
}
