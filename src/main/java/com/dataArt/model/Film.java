package com.dataArt.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by suxarina on 11/7/2015.
 */
@Entity
@Table(name = "FILM")
public class Film implements Serializable {
    private static final long serialVersionUID = 9092338275307240063L;

    private int id;
    private String title;
    private String description;
    private byte[] poster;
    private String linkTrailer;

    @Id
    @Column(name = "film_id", nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int filmId) {
        this.id = filmId;
    }

    @Basic
    @Column(name = "title", nullable = false, insertable = true, updatable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description", nullable = false, insertable = true, updatable = true, length = 65535)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "poster", nullable = false, insertable = true, updatable = true)
    public byte[] getPoster() {
        return poster;
    }

    public void setPoster(byte[] poster) {
        this.poster = poster;
    }

    @Basic
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

        Film that = (Film) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (!Arrays.equals(poster, that.poster)) return false;
        if (linkTrailer != null ? !linkTrailer.equals(that.linkTrailer) : that.linkTrailer != null) return false;

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
