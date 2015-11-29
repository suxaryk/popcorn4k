package com.dataArt.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by suxarina on 11/29/2015.
 */
@Entity
@Table(name = "FILM")
public class Film implements Serializable{

    private static final long serialVersionUID = 7156234876865000740L;
    private int id;
    private String title;
    private String description;
    private byte[] poster;
    private String linkTrailer;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "title", nullable = false, insertable = true, updatable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Column(name = "description", nullable = false, insertable = true, updatable = true, length = 65535)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "poster", nullable = false, insertable = true, updatable = true)
    public byte[] getPoster() {
        return poster;
    }

    public void setPoster(byte[] poster) {
        this.poster = poster;
    }


    @Column(name = "link_trailer", nullable = false, insertable = true, updatable = true, length = 200)
    public String getLinkTrailer() {
        return linkTrailer;
    }

    public void setLinkTrailer(String linkTrailer) {
        this.linkTrailer = linkTrailer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (id != film.id) return false;
        if (title != null ? !title.equals(film.title) : film.title != null) return false;
        if (description != null ? !description.equals(film.description) : film.description != null) return false;
        if (!Arrays.equals(poster, film.poster)) return false;
        if (linkTrailer != null ? !linkTrailer.equals(film.linkTrailer) : film.linkTrailer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (poster != null ? Arrays.hashCode(poster) : 0);
        result = 31 * result + (linkTrailer != null ? linkTrailer.hashCode() : 0);
        return result;
    }
}
