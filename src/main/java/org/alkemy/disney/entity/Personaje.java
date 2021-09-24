package org.alkemy.disney.entity;

import javax.persistence.*;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersonaje")
    private Long id;

    private String urlImagen;

    private String nombre;

    private String edad;

    private String peso;

    private String historia;

    public Personaje() {

    }

    public Personaje(Long id, String urlImagen, String nombre, String edad, String peso, String historia) {
        this.id = id;
        this.urlImagen = urlImagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
