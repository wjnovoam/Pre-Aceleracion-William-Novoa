package org.alkemy.disney.dto;

import org.alkemy.disney.entity.Character;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MovieDetalleDto implements Serializable {
    private Long id;
    private String urlImagen;
    private String titulo;
    private Date fechaCreacion;
    private double calificacion;
    private List<Character> personajes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public List<Character> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Character> personajes) {
        this.personajes = personajes;
    }
}
