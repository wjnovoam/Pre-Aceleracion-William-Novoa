package org.alkemy.disney.dto;

import java.io.Serializable;

public class CharacterBasicDto implements Serializable {
    private Long id;
    private String urlImagen;
    private String name;

    public CharacterBasicDto(Long id, String urlImagen, String name) {
        this.id = id;
        this.urlImagen = urlImagen;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
