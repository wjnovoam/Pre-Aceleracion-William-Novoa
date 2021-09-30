package org.alkemy.disney.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie")
    private Long id;

    @Column(name = "url_image")
    private String urlImage;

    @Column(name = "title")
    private String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name= "qualification")
    private double qualification;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_gender",
            joinColumns = {@JoinColumn(name = "id_movie")},
            inverseJoinColumns = {@JoinColumn(name = "id_gender")}
    )
    private List<Gender> genders;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "movie_characters",
            joinColumns = {@JoinColumn(name = "id_movie")},
            inverseJoinColumns = {@JoinColumn(name = "id_character")}
    )
    private List<Character> characters;

    public Movie() {
    }

    public Movie(Long id, String urlImage, String title, Date dateCreation, double qualification, List<Gender> genders, List<Character> characters) {
        this.id = id;
        this.urlImage = urlImage;
        this.title = title;
        this.dateCreation = dateCreation;
        this.qualification = qualification;
        this.genders = genders;
        this.characters = characters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getQualification() {
        return qualification;
    }

    public void setQualification(double qualification) {
        this.qualification = qualification;
    }

    public List<Gender> getGenders() {
        return genders;
    }

    public void setGenders(List<Gender> genders) {
        this.genders = genders;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
