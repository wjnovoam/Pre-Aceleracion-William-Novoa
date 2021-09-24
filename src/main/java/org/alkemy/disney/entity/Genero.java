package org.alkemy.disney.entity;

import javax.persistence.*;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGenero")
    private Long id;

    private String nombre;

    private String urlImagen;

    public Genero() {
    }

    public Genero(Long id, String nombre, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.urlImagen = urlImagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
