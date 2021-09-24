package org.alkemy.disney.service;

import org.alkemy.disney.entity.Personaje;

public interface PersonajeService {
    void guardarPersonaje(Personaje personaje);
    Personaje consultarPersonaje(Long id);
    Personaje actualizarPersonaje(Long id);
    void eliminarPersonaje(Long id);
}
