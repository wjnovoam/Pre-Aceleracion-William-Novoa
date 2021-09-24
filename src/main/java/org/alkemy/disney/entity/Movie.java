package org.alkemy.disney.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMovie")
    private Long id;

    private String urlImagen;

    private String titulo;

    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    private double calificacion;

    public Movie() {
    }

    public Movie(Long id, String urlImagen, String titulo, Date fechaCreacion, double calificacion) {
        this.id = id;
        this.urlImagen = urlImagen;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
    }

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
}
